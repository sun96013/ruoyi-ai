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
// source: SCEcho.proto

package tech.ordinaryroad.live.chat.client.kuaishou.protobuf;

public final class SCEchoOuterClass {
  private SCEchoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCEchoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCEcho)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string content = 1;</code>
     * @return The content.
     */
    java.lang.String getContent();
    /**
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();
  }
  /**
   * Protobuf type {@code SCEcho}
   */
  public static final class SCEcho extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCEcho)
      SCEchoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCEcho.newBuilder() to construct.
    private SCEcho(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCEcho() {
      content_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCEcho();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.internal_static_SCEcho_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.internal_static_SCEcho_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.class, tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.Builder.class);
    }

    public static final int CONTENT_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object content_ = "";
    /**
     * <code>string content = 1;</code>
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho other = (tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho) obj;

      if (!getContent()
          .equals(other.getContent())) return false;
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
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho prototype) {
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
     * Protobuf type {@code SCEcho}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCEcho)
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEchoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.internal_static_SCEcho_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.internal_static_SCEcho_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.class, tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.newBuilder()
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
        content_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.internal_static_SCEcho_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho build() {
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho buildPartial() {
        tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho result = new tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.content_ = content_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho other) {
        if (other == tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho.getDefaultInstance()) return this;
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          bitField0_ |= 0x00000001;
          onChanged();
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
              case 10: {
                content_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 1;</code>
       * @return The content.
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 1;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 1;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        content_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        content_ = getDefaultInstance().getContent();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string content = 1;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        content_ = value;
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:SCEcho)
    }

    // @@protoc_insertion_point(class_scope:SCEcho)
    private static final tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho();
    }

    public static tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCEcho>
        PARSER = new com.google.protobuf.AbstractParser<SCEcho>() {
      @java.lang.Override
      public SCEcho parsePartialFrom(
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

    public static com.google.protobuf.Parser<SCEcho> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SCEcho> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.kuaishou.protobuf.SCEchoOuterClass.SCEcho getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCEcho_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCEcho_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014SCEcho.proto\"\031\n\006SCEcho\022\017\n\007content\030\001 \001(" +
      "\tB6\n4tech.ordinaryroad.live.chat.client." +
      "kuaishou.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SCEcho_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCEcho_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCEcho_descriptor,
        new java.lang.String[] { "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}