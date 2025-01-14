package com.javaexperts.javasourcecode.models;

public class Fish extends Animal implements ISwim {
    boolean canBreathUnderWater;

    public Fish(String name, boolean canBreathUnderWater) {
        super(name);
        this.canBreathUnderWater = canBreathUnderWater;
    }

    @Override
    public String swimARound() {
        return "I am swimming a round and I am a fish";
    }
}
