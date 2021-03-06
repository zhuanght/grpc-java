// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

public final class BaseProto {
  private BaseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_Locality_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_Locality_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_Node_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_Node_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_Metadata_FilterMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_Metadata_FilterMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_RuntimeUInt32_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_RuntimeUInt32_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_HeaderValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_HeaderValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_HeaderValueOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_DataSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_DataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_TransportSocket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_TransportSocket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_SocketOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_SocketOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_RuntimeFractionalPercent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_RuntimeFractionalPercent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_core_ControlPlane_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_core_ControlPlane_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034envoy/api/v2/core/base.proto\022\021envoy.ap" +
      "i.v2.core\032\031google/protobuf/any.proto\032\034go" +
      "ogle/protobuf/struct.proto\032\036google/proto" +
      "buf/wrappers.proto\032\027validate/validate.pr" +
      "oto\032\030envoy/type/percent.proto\":\n\010Localit" +
      "y\022\016\n\006region\030\001 \001(\t\022\014\n\004zone\030\002 \001(\t\022\020\n\010sub_z" +
      "one\030\003 \001(\t\"\224\001\n\004Node\022\n\n\002id\030\001 \001(\t\022\017\n\007cluste" +
      "r\030\002 \001(\t\022)\n\010metadata\030\003 \001(\0132\027.google.proto" +
      "buf.Struct\022-\n\010locality\030\004 \001(\0132\033.envoy.api" +
      ".v2.core.Locality\022\025\n\rbuild_version\030\005 \001(\t" +
      "\"\244\001\n\010Metadata\022H\n\017filter_metadata\030\001 \003(\0132/" +
      ".envoy.api.v2.core.Metadata.FilterMetada" +
      "taEntry\032N\n\023FilterMetadataEntry\022\013\n\003key\030\001 " +
      "\001(\t\022&\n\005value\030\002 \001(\0132\027.google.protobuf.Str" +
      "uct:\0028\001\"F\n\rRuntimeUInt32\022\025\n\rdefault_valu" +
      "e\030\002 \001(\r\022\036\n\013runtime_key\030\003 \001(\tB\t\272\351\300\003\004r\002 \001\"" +
      "E\n\013HeaderValue\022\032\n\003key\030\001 \001(\tB\r\272\351\300\003\010r\006 \001(\200" +
      "\200\001\022\032\n\005value\030\002 \001(\tB\013\272\351\300\003\006r\004(\200\200\001\"{\n\021Header" +
      "ValueOption\022:\n\006header\030\001 \001(\0132\036.envoy.api." +
      "v2.core.HeaderValueB\n\272\351\300\003\005\212\001\002\020\001\022*\n\006appen" +
      "d\030\002 \001(\0132\032.google.protobuf.BoolValue\"\206\001\n\n" +
      "DataSource\022\035\n\010filename\030\001 \001(\tB\t\272\351\300\003\004r\002 \001H" +
      "\000\022!\n\014inline_bytes\030\002 \001(\014B\t\272\351\300\003\004z\002\020\001H\000\022\"\n\r" +
      "inline_string\030\003 \001(\tB\t\272\351\300\003\004r\002 \001H\000B\022\n\tspec" +
      "ifier\022\005\270\351\300\003\001\"\226\001\n\017TransportSocket\022\027\n\004name" +
      "\030\001 \001(\tB\t\272\351\300\003\004r\002 \001\022-\n\006config\030\002 \001(\0132\027.goog" +
      "le.protobuf.StructB\002\030\001H\000\022,\n\014typed_config" +
      "\030\003 \001(\0132\024.google.protobuf.AnyH\000B\r\n\013config" +
      "_type\"\224\002\n\014SocketOption\022\023\n\013description\030\001 " +
      "\001(\t\022\r\n\005level\030\002 \001(\003\022\014\n\004name\030\003 \001(\003\022\023\n\tint_" +
      "value\030\004 \001(\003H\000\022\023\n\tbuf_value\030\005 \001(\014H\000\022P\n\005st" +
      "ate\030\006 \001(\0162+.envoy.api.v2.core.SocketOpti" +
      "on.SocketStateB\024\272\351\300\003\005\212\001\002\020\001\272\351\300\003\005\202\001\002\020\001\"F\n\013" +
      "SocketState\022\021\n\rSTATE_PREBIND\020\000\022\017\n\013STATE_" +
      "BOUND\020\001\022\023\n\017STATE_LISTENING\020\002B\016\n\005value\022\005\270" +
      "\351\300\003\001\"q\n\030RuntimeFractionalPercent\022@\n\rdefa" +
      "ult_value\030\001 \001(\0132\035.envoy.type.FractionalP" +
      "ercentB\n\272\351\300\003\005\212\001\002\020\001\022\023\n\013runtime_key\030\002 \001(\t\"" +
      "\"\n\014ControlPlane\022\022\n\nidentifier\030\001 \001(\t*(\n\017R" +
      "outingPriority\022\013\n\007DEFAULT\020\000\022\010\n\004HIGH\020\001*~\n" +
      "\rRequestMethod\022\026\n\022METHOD_UNSPECIFIED\020\000\022\007" +
      "\n\003GET\020\001\022\010\n\004HEAD\020\002\022\010\n\004POST\020\003\022\007\n\003PUT\020\004\022\n\n\006" +
      "DELETE\020\005\022\013\n\007CONNECT\020\006\022\013\n\007OPTIONS\020\007\022\t\n\005TR" +
      "ACE\020\010B4\n\037io.envoyproxy.envoy.api.v2.core" +
      "B\tBaseProtoP\001Z\004coreb\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          validate.Validate.getDescriptor(),
          io.envoyproxy.envoy.type.PercentProto.getDescriptor(),
        }, assigner);
    internal_static_envoy_api_v2_core_Locality_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_core_Locality_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_Locality_descriptor,
        new java.lang.String[] { "Region", "Zone", "SubZone", });
    internal_static_envoy_api_v2_core_Node_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_core_Node_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_Node_descriptor,
        new java.lang.String[] { "Id", "Cluster", "Metadata", "Locality", "BuildVersion", });
    internal_static_envoy_api_v2_core_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_core_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_Metadata_descriptor,
        new java.lang.String[] { "FilterMetadata", });
    internal_static_envoy_api_v2_core_Metadata_FilterMetadataEntry_descriptor =
      internal_static_envoy_api_v2_core_Metadata_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_core_Metadata_FilterMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_Metadata_FilterMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_api_v2_core_RuntimeUInt32_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_api_v2_core_RuntimeUInt32_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_RuntimeUInt32_descriptor,
        new java.lang.String[] { "DefaultValue", "RuntimeKey", });
    internal_static_envoy_api_v2_core_HeaderValue_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_api_v2_core_HeaderValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_HeaderValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_api_v2_core_HeaderValueOption_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_api_v2_core_HeaderValueOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_HeaderValueOption_descriptor,
        new java.lang.String[] { "Header", "Append", });
    internal_static_envoy_api_v2_core_DataSource_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_api_v2_core_DataSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_DataSource_descriptor,
        new java.lang.String[] { "Filename", "InlineBytes", "InlineString", "Specifier", });
    internal_static_envoy_api_v2_core_TransportSocket_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_api_v2_core_TransportSocket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_TransportSocket_descriptor,
        new java.lang.String[] { "Name", "Config", "TypedConfig", "ConfigType", });
    internal_static_envoy_api_v2_core_SocketOption_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_envoy_api_v2_core_SocketOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_SocketOption_descriptor,
        new java.lang.String[] { "Description", "Level", "Name", "IntValue", "BufValue", "State", "Value", });
    internal_static_envoy_api_v2_core_RuntimeFractionalPercent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_envoy_api_v2_core_RuntimeFractionalPercent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_RuntimeFractionalPercent_descriptor,
        new java.lang.String[] { "DefaultValue", "RuntimeKey", });
    internal_static_envoy_api_v2_core_ControlPlane_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_envoy_api_v2_core_ControlPlane_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_core_ControlPlane_descriptor,
        new java.lang.String[] { "Identifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(validate.Validate.required);
    registry.add(validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    validate.Validate.getDescriptor();
    io.envoyproxy.envoy.type.PercentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
