// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PbMessage.proto

package protomodel;

public final class PbMessage {
  private PbMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .ChatMethod.Type chatMethod = 1;</code>
     */
    int getChatMethodValue();
    /**
     * <code>optional .ChatMethod.Type chatMethod = 1;</code>
     */
    protomodel.PbCommonEnum.ChatMethod.Type getChatMethod();

    /**
     * <code>optional string roomName = 2;</code>
     */
    java.lang.String getRoomName();
    /**
     * <code>optional string roomName = 2;</code>
     */
    com.google.protobuf.ByteString
        getRoomNameBytes();

    /**
     * <code>optional string nickName = 3;</code>
     */
    java.lang.String getNickName();
    /**
     * <code>optional string nickName = 3;</code>
     */
    com.google.protobuf.ByteString
        getNickNameBytes();

    /**
     * <code>optional string msg = 4;</code>
     */
    java.lang.String getMsg();
    /**
     * <code>optional string msg = 4;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code ChatMessage}
   */
  public  static final class ChatMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatMessage)
      ChatMessageOrBuilder {
    // Use ChatMessage.newBuilder() to construct.
    private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatMessage() {
      chatMethod_ = 0;
      roomName_ = "";
      nickName_ = "";
      msg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ChatMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              chatMethod_ = rawValue;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              roomName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              nickName_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              msg_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protomodel.PbMessage.internal_static_ChatMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protomodel.PbMessage.internal_static_ChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protomodel.PbMessage.ChatMessage.class, protomodel.PbMessage.ChatMessage.Builder.class);
    }

    public static final int CHATMETHOD_FIELD_NUMBER = 1;
    private int chatMethod_;
    /**
     * <code>optional .ChatMethod.Type chatMethod = 1;</code>
     */
    public int getChatMethodValue() {
      return chatMethod_;
    }
    /**
     * <code>optional .ChatMethod.Type chatMethod = 1;</code>
     */
    public protomodel.PbCommonEnum.ChatMethod.Type getChatMethod() {
      protomodel.PbCommonEnum.ChatMethod.Type result = protomodel.PbCommonEnum.ChatMethod.Type.valueOf(chatMethod_);
      return result == null ? protomodel.PbCommonEnum.ChatMethod.Type.UNRECOGNIZED : result;
    }

    public static final int ROOMNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object roomName_;
    /**
     * <code>optional string roomName = 2;</code>
     */
    public java.lang.String getRoomName() {
      java.lang.Object ref = roomName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomName_ = s;
        return s;
      }
    }
    /**
     * <code>optional string roomName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoomNameBytes() {
      java.lang.Object ref = roomName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICKNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object nickName_;
    /**
     * <code>optional string nickName = 3;</code>
     */
    public java.lang.String getNickName() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickName_ = s;
        return s;
      }
    }
    /**
     * <code>optional string nickName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNickNameBytes() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSG_FIELD_NUMBER = 4;
    private volatile java.lang.Object msg_;
    /**
     * <code>optional string msg = 4;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <code>optional string msg = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (chatMethod_ != protomodel.PbCommonEnum.ChatMethod.Type.NONE.getNumber()) {
        output.writeEnum(1, chatMethod_);
      }
      if (!getRoomNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomName_);
      }
      if (!getNickNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickName_);
      }
      if (!getMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, msg_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chatMethod_ != protomodel.PbCommonEnum.ChatMethod.Type.NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, chatMethod_);
      }
      if (!getRoomNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomName_);
      }
      if (!getNickNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickName_);
      }
      if (!getMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, msg_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protomodel.PbMessage.ChatMessage)) {
        return super.equals(obj);
      }
      protomodel.PbMessage.ChatMessage other = (protomodel.PbMessage.ChatMessage) obj;

      boolean result = true;
      result = result && chatMethod_ == other.chatMethod_;
      result = result && getRoomName()
          .equals(other.getRoomName());
      result = result && getNickName()
          .equals(other.getNickName());
      result = result && getMsg()
          .equals(other.getMsg());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + CHATMETHOD_FIELD_NUMBER;
      hash = (53 * hash) + chatMethod_;
      hash = (37 * hash) + ROOMNAME_FIELD_NUMBER;
      hash = (53 * hash) + getRoomName().hashCode();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickName().hashCode();
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protomodel.PbMessage.ChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protomodel.PbMessage.ChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protomodel.PbMessage.ChatMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protomodel.PbMessage.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protomodel.PbMessage.ChatMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ChatMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatMessage)
        protomodel.PbMessage.ChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protomodel.PbMessage.internal_static_ChatMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protomodel.PbMessage.internal_static_ChatMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protomodel.PbMessage.ChatMessage.class, protomodel.PbMessage.ChatMessage.Builder.class);
      }

      // Construct using protomodel.PbMessage.ChatMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        chatMethod_ = 0;

        roomName_ = "";

        nickName_ = "";

        msg_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protomodel.PbMessage.internal_static_ChatMessage_descriptor;
      }

      public protomodel.PbMessage.ChatMessage getDefaultInstanceForType() {
        return protomodel.PbMessage.ChatMessage.getDefaultInstance();
      }

      public protomodel.PbMessage.ChatMessage build() {
        protomodel.PbMessage.ChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protomodel.PbMessage.ChatMessage buildPartial() {
        protomodel.PbMessage.ChatMessage result = new protomodel.PbMessage.ChatMessage(this);
        result.chatMethod_ = chatMethod_;
        result.roomName_ = roomName_;
        result.nickName_ = nickName_;
        result.msg_ = msg_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protomodel.PbMessage.ChatMessage) {
          return mergeFrom((protomodel.PbMessage.ChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protomodel.PbMessage.ChatMessage other) {
        if (other == protomodel.PbMessage.ChatMessage.getDefaultInstance()) return this;
        if (other.chatMethod_ != 0) {
          setChatMethodValue(other.getChatMethodValue());
        }
        if (!other.getRoomName().isEmpty()) {
          roomName_ = other.roomName_;
          onChanged();
        }
        if (!other.getNickName().isEmpty()) {
          nickName_ = other.nickName_;
          onChanged();
        }
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protomodel.PbMessage.ChatMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protomodel.PbMessage.ChatMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int chatMethod_ = 0;
      /**
       * <code>optional .ChatMethod.Type chatMethod = 1;</code>
       */
      public int getChatMethodValue() {
        return chatMethod_;
      }
      /**
       * <code>optional .ChatMethod.Type chatMethod = 1;</code>
       */
      public Builder setChatMethodValue(int value) {
        chatMethod_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .ChatMethod.Type chatMethod = 1;</code>
       */
      public protomodel.PbCommonEnum.ChatMethod.Type getChatMethod() {
        protomodel.PbCommonEnum.ChatMethod.Type result = protomodel.PbCommonEnum.ChatMethod.Type.valueOf(chatMethod_);
        return result == null ? protomodel.PbCommonEnum.ChatMethod.Type.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .ChatMethod.Type chatMethod = 1;</code>
       */
      public Builder setChatMethod(protomodel.PbCommonEnum.ChatMethod.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        chatMethod_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .ChatMethod.Type chatMethod = 1;</code>
       */
      public Builder clearChatMethod() {
        
        chatMethod_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object roomName_ = "";
      /**
       * <code>optional string roomName = 2;</code>
       */
      public java.lang.String getRoomName() {
        java.lang.Object ref = roomName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          roomName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string roomName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRoomNameBytes() {
        java.lang.Object ref = roomName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          roomName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string roomName = 2;</code>
       */
      public Builder setRoomName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        roomName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string roomName = 2;</code>
       */
      public Builder clearRoomName() {
        
        roomName_ = getDefaultInstance().getRoomName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string roomName = 2;</code>
       */
      public Builder setRoomNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        roomName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nickName_ = "";
      /**
       * <code>optional string nickName = 3;</code>
       */
      public java.lang.String getNickName() {
        java.lang.Object ref = nickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string nickName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNickNameBytes() {
        java.lang.Object ref = nickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string nickName = 3;</code>
       */
      public Builder setNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string nickName = 3;</code>
       */
      public Builder clearNickName() {
        
        nickName_ = getDefaultInstance().getNickName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string nickName = 3;</code>
       */
      public Builder setNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <code>optional string msg = 4;</code>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string msg = 4;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string msg = 4;</code>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 4;</code>
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 4;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:ChatMessage)
    }

    // @@protoc_insertion_point(class_scope:ChatMessage)
    private static final protomodel.PbMessage.ChatMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protomodel.PbMessage.ChatMessage();
    }

    public static protomodel.PbMessage.ChatMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatMessage>
        PARSER = new com.google.protobuf.AbstractParser<ChatMessage>() {
      public ChatMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ChatMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMessage> getParserForType() {
      return PARSER;
    }

    public protomodel.PbMessage.ChatMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017PbMessage.proto\032\022PbCommonEnum.proto\"d\n" +
      "\013ChatMessage\022$\n\nchatMethod\030\001 \001(\0162\020.ChatM" +
      "ethod.Type\022\020\n\010roomName\030\002 \001(\t\022\020\n\010nickName" +
      "\030\003 \001(\t\022\013\n\003msg\030\004 \001(\tB\027\n\nprotomodelB\tPbMes" +
      "sageb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          protomodel.PbCommonEnum.getDescriptor(),
        }, assigner);
    internal_static_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatMessage_descriptor,
        new java.lang.String[] { "ChatMethod", "RoomName", "NickName", "Msg", });
    protomodel.PbCommonEnum.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
