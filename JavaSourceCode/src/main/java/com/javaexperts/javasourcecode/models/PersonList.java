package com.javaexperts.javasourcecode.models;

import java.util.Optional;

public class PersonList {
    private Person[] persons;
    private int index;

    public PersonList() {
        this.persons = new Person[3];
        this.index = 0;
    }

    public void addPerson(Person person) {
        if (this.index >= 3) {
            return;
        }

        this.persons[this.index] = person;
        this.index++;
    }

    public Optional<Person> findPersonByName(String name) {
        for (Person person : this.persons) {
            if (person != null && person.getName().equals(name)) {
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }

    public Person getPerson(int index) {
        return this.persons[index];
    }
}
