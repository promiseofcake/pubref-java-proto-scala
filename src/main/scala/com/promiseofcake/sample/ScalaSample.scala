package com.promiseofcake.sample

import com.promiseofcake.proto.c.C

object ScalaSample {
  def generateC(): C = {
    C.newBuilder().setId("c").build()
  }

  def main(args: Array[String]): Unit = {
    println(generateC().getMessageB.getMessageA.getId)
  }
}
