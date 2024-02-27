/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SCWebAuthorPause.proto

package tech.ordinaryroad.live.chat.client.kuaishou.protobuf;

public final class SCWebAuthorPauseOuterClass {
  private SCWebAuthorPauseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCWebAuthorPauseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCWebAuthorPause)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 time = 1;</code>
     * @return The time.
     */
    long getTime();

    /**
     * <code>.WebPauseType pauseType = 2;</code>
     * @return The enum numeric value on the wire for pauseType.
     */
    int getPauseTypeValue();
    /**
     * <code>.WebPauseType pauseType = 2;</code>
     * @return The pauseType.
     */
    tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType getPauseType();
  }
  /**
   * Protobuf type {@code SCWebAuthorPause}
   */
  public static final class SCWebAuthorPause extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCWebAuthorPause)
      SCWebAuthorPauseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCWebAuthorPause.newBuilder() to construct.
    private SCWebAuthorPause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCWebAuthorPause() {
      pauseType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCWebAuthorPause();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.internal_static_SCWebAuthorPause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.internal_static_SCWebAuthorPause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.class, tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.Builder.class);
    }

    public static final int TIME_FIELD_NUMBER = 1;
    private long time_ = 0L;
    /**
     * <code>uint64 time = 1;</code>
     * @return The time.
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }

    public static final int PAUSETYPE_FIELD_NUMBER = 2;
    private int pauseType_ = 0;
    /**
     * <code>.WebPauseType pauseType = 2;</code>
     * @return The enum numeric value on the wire for pauseType.
     */
    @java.lang.Override public int getPauseTypeValue() {
      return pauseType_;
    }
    /**
     * <code>.WebPauseType pauseType = 2;</code>
     * @return The pauseType.
     */
    @java.lang.Override public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType getPauseType() {
      tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType result = tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType.forNumber(pauseType_);
      return result == null ? tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (time_ != 0L) {
        output.writeUInt64(1, time_);
      }
      if (pauseType_ != tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType.UNKNOWN_PAUSE_TYPE.getNumber()) {
        output.writeEnum(2, pauseType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, time_);
      }
      if (pauseType_ != tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType.UNKNOWN_PAUSE_TYPE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, pauseType_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause other = (tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause) obj;

      if (getTime()
          != other.getTime()) return false;
      if (pauseType_ != other.pauseType_) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (37 * hash) + PAUSETYPE_FIELD_NUMBER;
      hash = (53 * hash) + pauseType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code SCWebAuthorPause}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCWebAuthorPause)
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPauseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.internal_static_SCWebAuthorPause_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.internal_static_SCWebAuthorPause_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.class, tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        time_ = 0L;
        pauseType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.internal_static_SCWebAuthorPause_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause build() {
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause buildPartial() {
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause result = new tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.time_ = time_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pauseType_ = pauseType_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause other) {
        if (other == tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause.getDefaultInstance()) return this;
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        if (other.pauseType_ != 0) {
          setPauseTypeValue(other.getPauseTypeValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                time_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                pauseType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long time_ ;
      /**
       * <code>uint64 time = 1;</code>
       * @return The time.
       */
      @java.lang.Override
      public long getTime() {
        return time_;
      }
      /**
       * <code>uint64 time = 1;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(long value) {

        time_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0L;
        onChanged();
        return this;
      }

      private int pauseType_ = 0;
      /**
       * <code>.WebPauseType pauseType = 2;</code>
       * @return The enum numeric value on the wire for pauseType.
       */
      @java.lang.Override public int getPauseTypeValue() {
        return pauseType_;
      }
      /**
       * <code>.WebPauseType pauseType = 2;</code>
       * @param value The enum numeric value on the wire for pauseType to set.
       * @return This builder for chaining.
       */
      public Builder setPauseTypeValue(int value) {
        pauseType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WebPauseType pauseType = 2;</code>
       * @return The pauseType.
       */
      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType getPauseType() {
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType result = tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType.forNumber(pauseType_);
        return result == null ? tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType.UNRECOGNIZED : result;
      }
      /**
       * <code>.WebPauseType pauseType = 2;</code>
       * @param value The pauseType to set.
       * @return This builder for chaining.
       */
      public Builder setPauseType(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.WebPauseType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        pauseType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WebPauseType pauseType = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPauseType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pauseType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SCWebAuthorPause)
    }

    // @@protoc_insertion_point(class_scope:SCWebAuthorPause)
    private static final tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause();
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCWebAuthorPause>
        PARSER = new com.google.protobuf.AbstractParser<SCWebAuthorPause>() {
      @java.lang.Override
      public SCWebAuthorPause parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SCWebAuthorPause> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SCWebAuthorPause> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCWebAuthorPauseOuterClass.SCWebAuthorPause getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCWebAuthorPause_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCWebAuthorPause_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SCWebAuthorPause.proto\032\022WebPauseType.p" +
      "roto\"B\n\020SCWebAuthorPause\022\014\n\004time\030\001 \001(\004\022 " +
      "\n\tpauseType\030\002 \001(\0162\r.WebPauseTypeB6\n4tech" +
      ".ordinaryroad.live.chat.client.kuaishou." +
      "protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.getDescriptor(),
        });
    internal_static_SCWebAuthorPause_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCWebAuthorPause_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCWebAuthorPause_descriptor,
        new java.lang.String[] { "Time", "PauseType", });
    tech.ordinaryroad.live.chat.client.kuaishou.protobuf.WebPauseTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}