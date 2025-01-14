package com.javaexperts.javasourcecode.models;

final public class Adder<E extends Number> {
    final private E[] numbers;

    public Adder(E[] numbers) {
        this.numbers = numbers;
    }

    public double getSum() {
        double sum = 0.0d;

        for (E number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
