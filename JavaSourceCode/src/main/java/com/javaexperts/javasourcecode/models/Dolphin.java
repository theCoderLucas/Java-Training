package com.javaexperts.javasourcecode.models;

public class Dolphin extends Animal implements ISwim{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String swimARound() {
        return "I am swimming a round and I am a dolphin";
    }
}
