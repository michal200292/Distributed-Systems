// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

// Protobuf Java Version: 4.26.1
package sr.proto;

/**
 * Protobuf enum {@code MatchInfo}
 */
public enum MatchInfo
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MATCH_INFO_START = 0;</code>
   */
  MATCH_INFO_START(0),
  /**
   * <code>MATCH_INFO_GOAL = 1;</code>
   */
  MATCH_INFO_GOAL(1),
  /**
   * <code>MATCH_INFO_MID_MATCH_STATS = 2;</code>
   */
  MATCH_INFO_MID_MATCH_STATS(2),
  /**
   * <code>MATCH_INFO_FIRST_HALF_STATS = 3;</code>
   */
  MATCH_INFO_FIRST_HALF_STATS(3),
  /**
   * <code>MATCH_INFO_WHOLE_MATCH_STATS = 4;</code>
   */
  MATCH_INFO_WHOLE_MATCH_STATS(4),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      MatchInfo.class.getName());
  }
  /**
   * <code>MATCH_INFO_START = 0;</code>
   */
  public static final int MATCH_INFO_START_VALUE = 0;
  /**
   * <code>MATCH_INFO_GOAL = 1;</code>
   */
  public static final int MATCH_INFO_GOAL_VALUE = 1;
  /**
   * <code>MATCH_INFO_MID_MATCH_STATS = 2;</code>
   */
  public static final int MATCH_INFO_MID_MATCH_STATS_VALUE = 2;
  /**
   * <code>MATCH_INFO_FIRST_HALF_STATS = 3;</code>
   */
  public static final int MATCH_INFO_FIRST_HALF_STATS_VALUE = 3;
  /**
   * <code>MATCH_INFO_WHOLE_MATCH_STATS = 4;</code>
   */
  public static final int MATCH_INFO_WHOLE_MATCH_STATS_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MatchInfo valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MatchInfo forNumber(int value) {
    switch (value) {
      case 0: return MATCH_INFO_START;
      case 1: return MATCH_INFO_GOAL;
      case 2: return MATCH_INFO_MID_MATCH_STATS;
      case 3: return MATCH_INFO_FIRST_HALF_STATS;
      case 4: return MATCH_INFO_WHOLE_MATCH_STATS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MatchInfo>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MatchInfo> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MatchInfo>() {
          public MatchInfo findValueByNumber(int number) {
            return MatchInfo.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return sr.proto.Match.getDescriptor().getEnumTypes().get(0);
  }

  private static final MatchInfo[] VALUES = values();

  public static MatchInfo valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MatchInfo(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MatchInfo)
}

