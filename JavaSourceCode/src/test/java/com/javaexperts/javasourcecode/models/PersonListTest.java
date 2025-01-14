package com.javaexperts.javasourcecode.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonListTest {

    @BeforeEach
    void setUp() {}

    @AfterEach
    void tearDown() {}

    @Test
    void testAddPersonInEmptyArray() {
        // Arrange
        PersonList personList = new PersonList();
        Person personToAdd = new Person(19, "Ella", false);

        // Act
        personList.addPerson(personToAdd);
        Person realPerson = personList.getPerson(0);

        // Assert
        assertEquals(personToAdd, realPerson, "Add function incorrect");
    }

    @Test
    void testAddPersonNotInEmptyArray() {
        // Arrange
        PersonList personList = new PersonList();
        Person personToAdd1 = new Person(19, "Ella", false);
        Person personToAdd2 = new Person(18, "Peter", true);

        // Act
        personList.addPerson(personToAdd1);
        personList.addPerson(personToAdd2);
        Person realPerson = personList.getPerson(1);

        // Assert
        assertEquals(personToAdd2, realPerson, "Add function incorrect");
    }

    void testAddPersonInFullArray() {
        // Arrange
        PersonList personList = new PersonList();
        Person personToAdd1 = new Person(19, "Ella", false);
        Person personToAdd2 = new Person(18, "Peter", true);
        Person personToAdd3 = new Person(20, "Jana", false);
        Person personToAdd4 = new Person(21, "Finn", true);

        // Act
        personList.addPerson(personToAdd1);
        personList.addPerson(personToAdd2);
        personList.addPerson(personToAdd3);
        personList.addPerson(personToAdd4);
        Person realPerson = personList.getPerson(2);

        // Assert
        assertEquals(personToAdd3, realPerson, "Add function incorrect");
    }

    @Test
    void testFindPersonByName() {}
}