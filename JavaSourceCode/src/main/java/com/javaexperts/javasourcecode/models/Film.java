package com.javaexperts.javasourcecode.models;

import java.util.Objects;

public class Film {
    private String name;
    private int length;

    public Film(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return getLength() == film.getLength() && Objects.equals(getName(), film.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLength());
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
