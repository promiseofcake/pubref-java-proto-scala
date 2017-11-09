git_repository(
      name = "io_bazel_rules_scala",
      remote = "https://github.com/bazelbuild/rules_scala.git",
      commit = "85308acbd316477f3072e033e7744debcba4f054",
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories()

git_repository(
    name = "org_pubref_rules_protobuf",
    remote = "https://github.com/pubref/rules_protobuf",
    tag = "v0.7.1",
)

load("@org_pubref_rules_protobuf//protobuf:rules.bzl", "proto_repositories")

proto_repositories()

load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_repositories")

java_proto_repositories()
