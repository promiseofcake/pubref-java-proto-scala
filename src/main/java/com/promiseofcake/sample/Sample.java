package com.promiseofcake.sample;

import com.promiseofcake.proto.c.C;

class Sample {
    private static C generateC() {
        return C.newBuilder().setId("c").build();
    }

    public static void main(String[] args) {
        C c = generateC();
        System.out.println(c.getMessageB().getMessageA().getId());
    }
}
