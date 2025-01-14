package com.javaexperts.javasourcecode.models;

import com.javaexperts.javasourcecode.core.ETypes;

import java.util.Objects;

// classes
public class Person {
    // instance variables
    private int age;
    private String name;
    private boolean isMale;

    // class variables
    private static int numberOfPersons = 0;

    // full-args constructor
    public Person(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
        Person.numberOfPersons++;
    }

    // constructor chaining
    public Person(int age, String name) {
        this(age, name, true);
    }

    // getter and setter
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return this.isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public static int getNumberOfPersons() {
        return Person.numberOfPersons;
    }

    public String getGreeting() {
        return "Hello, I am a person";
    }

    public ETypes getType() {
        return ETypes.PERSON;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
