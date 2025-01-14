package com.javaexperts.javasourcecode.models;

public interface ISwim {
    String swimARound();
    default String sayHello() {
        return "Hello!";
    }
}
