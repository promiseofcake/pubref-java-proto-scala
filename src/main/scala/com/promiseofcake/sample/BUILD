load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "sample",
    srcs = ["ScalaSample.scala"],
    main_class = "com.promiseofcake.sample.ScalaSample",
    deps = [
        "//proto:c",
    ],
)
