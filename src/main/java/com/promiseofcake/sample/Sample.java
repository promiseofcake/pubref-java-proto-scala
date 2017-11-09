package com.promiseofcake.sample;

import com.promiseofcake.proto.a.A;

class Sample {
    private static A generateA() {
        return A.newBuilder().setId("foo").build();
    }

    public static void main(String[] args) {
        A a = generateA();
        System.out.println(a.getId());
    }
}
