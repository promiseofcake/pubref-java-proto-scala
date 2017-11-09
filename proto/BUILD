package(default_visibility = ["//visibility:public"])

load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_library")

filegroup(
    name = "proto_files_a",
    srcs = glob(["a/*.proto"]),
)

filegroup(
    name = "proto_files_b",
    srcs = glob(["b/*.proto"]),
)

filegroup(
    name = "proto_files_c",
    srcs = glob(["c/*.proto"]),
)

java_proto_library(
    name = "a",
    protos = [":proto_files_a"],
    with_grpc = True,
)

java_proto_library(
    name = "b",
    proto_deps = [
        ":a",
    ],
    protos = [":proto_files_b"],
    with_grpc = True,
)

java_proto_library(
    name = "c",
    proto_deps = [
        ":b",
    ],
    protos = [":proto_files_c"],
    with_grpc = True,
)
