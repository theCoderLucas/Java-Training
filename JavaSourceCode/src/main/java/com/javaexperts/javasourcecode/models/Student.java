package com.javaexperts.javasourcecode.models;

import com.javaexperts.javasourcecode.core.ETypes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

// inheritance
final public class Student extends Person {
    private String major;

    public Student(int age, String name, boolean isMale, String major) {
        // super = calls the super class
        super(age, name, isMale);
        this.major = major;
    }

    public Student(int age, String name, String major) {
        super(age, name, true);
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public ETypes getType() {
        return ETypes.STUDENT;
    }

    @Override
    public String getGreeting() {
        return "Hello, I am a student";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getMajor(), student.getMajor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMajor());
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}
