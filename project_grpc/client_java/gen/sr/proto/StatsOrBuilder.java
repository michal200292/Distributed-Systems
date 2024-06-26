// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

// Protobuf Java Version: 4.26.1
package sr.proto;

public interface StatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Stats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MatchInfo info = 1;</code>
   * @return The enum numeric value on the wire for info.
   */
  int getInfoValue();
  /**
   * <code>.MatchInfo info = 1;</code>
   * @return The info.
   */
  sr.proto.MatchInfo getInfo();

  /**
   * <code>.Teams names = 2;</code>
   * @return Whether the names field is set.
   */
  boolean hasNames();
  /**
   * <code>.Teams names = 2;</code>
   * @return The names.
   */
  sr.proto.Teams getNames();
  /**
   * <code>.Teams names = 2;</code>
   */
  sr.proto.TeamsOrBuilder getNamesOrBuilder();

  /**
   * <code>.Score score = 3;</code>
   * @return Whether the score field is set.
   */
  boolean hasScore();
  /**
   * <code>.Score score = 3;</code>
   * @return The score.
   */
  sr.proto.Score getScore();
  /**
   * <code>.Score score = 3;</code>
   */
  sr.proto.ScoreOrBuilder getScoreOrBuilder();

  /**
   * <code>int32 minute = 4;</code>
   * @return The minute.
   */
  int getMinute();

  /**
   * <code>.Shots shots = 5;</code>
   * @return Whether the shots field is set.
   */
  boolean hasShots();
  /**
   * <code>.Shots shots = 5;</code>
   * @return The shots.
   */
  sr.proto.Shots getShots();
  /**
   * <code>.Shots shots = 5;</code>
   */
  sr.proto.ShotsOrBuilder getShotsOrBuilder();

  /**
   * <code>.Possession possession = 6;</code>
   * @return Whether the possession field is set.
   */
  boolean hasPossession();
  /**
   * <code>.Possession possession = 6;</code>
   * @return The possession.
   */
  sr.proto.Possession getPossession();
  /**
   * <code>.Possession possession = 6;</code>
   */
  sr.proto.PossessionOrBuilder getPossessionOrBuilder();

  /**
   * <code>.Passes passes = 7;</code>
   * @return Whether the passes field is set.
   */
  boolean hasPasses();
  /**
   * <code>.Passes passes = 7;</code>
   * @return The passes.
   */
  sr.proto.Passes getPasses();
  /**
   * <code>.Passes passes = 7;</code>
   */
  sr.proto.PassesOrBuilder getPassesOrBuilder();
}
