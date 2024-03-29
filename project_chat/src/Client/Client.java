package src.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import src.UdpHandlers.Multicastreceiver;
import src.UdpHandlers.UDPhandler;

public class Client {

    public String clientName;
    public String hostName;
    public int portNumber;
    private Scanner input;
    private DatagramSocket udpSocket;
    private DatagramPacket packet;
    private PrintWriter out;
    private BufferedReader in;

    public Client(String clientName, String hostName, int portNumber){
        this.clientName = clientName;
        this.hostName = hostName;
        this.portNumber = portNumber;
        this.input = new Scanner(System.in);
    }

    public static void main(String[] args) throws IOException{
        if(args.length != 3){
            System.err.println("Arguments should of the form <client_name> <server_ip> <port_number>");
            System.exit(1);
        }
        Client client = new Client(args[0], args[1], Integer.parseInt(args[2]));
        client.run();
    }


    public void run() throws IOException{
        try(Socket socket = new Socket(hostName, portNumber)) {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            out.println(clientName);
            String response = in.readLine();
            if(response.equals("NACK")){
                System.out.println("Nickname " + clientName + " is already taken");
                return;
            }
            else{
                System.out.println("Connected to server");
            }

            udpSocket = new DatagramSocket();
            UDPhandler listenerUDP = new UDPhandler(null, socket.getLocalPort());
            new Thread(listenerUDP).start();

            ListenerTCP listenerTCP = new ListenerTCP(socket, in);
            new Thread(listenerTCP).start();

            new Thread(new Multicastreceiver(clientName)).start();

            String line = "";
            while(input.hasNextLine() && !(line = input.nextLine().trim()).equals("end")){
                if(line.length() == 1 && line.charAt(0) == 'U'){
                    sendUdp();
                }
                else if(line.length() == 1 && line.charAt(0) == 'M'){
                    sendMulticast();
                }
                else{
                    out.println(line);
                }
            }

        } catch (Exception e) {
            
        } finally {
            if (out != null) out.close();
            if (in != null) in.close();
            if (input != null) input.close();
            if (udpSocket != null) udpSocket.close();   
        }
    }

    public String parseInput(){

        StringBuilder udpMsg = new StringBuilder(clientName + " ");
        String line = "/";
        while(!line.equals("") && input.hasNextLine()){
            line = input.nextLine();
            udpMsg.append(line);
            udpMsg.append('\n');
        }

        udpMsg.delete(udpMsg.length() - 2, udpMsg.length() - 1);
        return udpMsg.toString();
    }

    public void sendUdp() throws IOException{
        InetAddress address = InetAddress.getByName(hostName);
        byte[] buff = parseInput().getBytes();
        packet = new DatagramPacket(buff, buff.length, address, portNumber);
        udpSocket.send(packet);
    }

    public void sendMulticast() throws IOException{
        InetAddress group = InetAddress.getByName("230.0.0.0");
        byte[] buff = parseInput().getBytes();
        packet = new DatagramPacket(buff, buff.length, group, 9009);
        udpSocket.send(packet);
    }
}
