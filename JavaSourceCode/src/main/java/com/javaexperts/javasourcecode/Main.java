package com.javaexperts.javasourcecode;

import com.javaexperts.javasourcecode.core.ELevel;
import com.javaexperts.javasourcecode.core.ETypes;
import com.javaexperts.javasourcecode.logic.MediaShelf;
import com.javaexperts.javasourcecode.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int getANumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        // data types
        boolean bool = true;
        int integer = 5;
        float floatingPointNumber = 2.4f;
        double doublePointNumber = 1.2d;
        String text = "Hello World!";

        StringBuilder textNumbers = new StringBuilder();

        // for loop
        for (int index = 1; index <= 9; index++) {
            textNumbers.append(index);
        }

        System.out.println(textNumbers.toString());

        Person person1 = new Person(19, "Ella", false);
        System.out.println(person1.isMale());
        Person person2 = new Person(20, "Jonas");
        System.out.println(person2.isMale());
        System.out.println(Person.getNumberOfPersons());
        System.out.println(person1);

        Person person3 = new Person(19, "Ella", true);
        System.out.println(person1.equals(person3));

        // array
        String[] names = { "Jana", "Peter" }; // explicit array definition -> max. capacity = 2
        int[] numbers = new int[10]; // implicit array definition -> max. capacity = 10

        for (int index = 1; index <= 10; index++) {
            numbers[index - 1] = index;
        }

        // foreach
        for (int num : numbers) {
//            if (num % 2 == 0) {
//                System.out.println(Integer.toString(num) + " is even");
//            } else {
//                System.out.println(Integer.toString(num) + " is odd");
//            }

            // Elvis operator (condition) ? true : false
            System.out.printf(Integer.toString(num) + " is %s%n", (num % 2 == 0) ? "even" : "odd");
//          System.out.println(Integer.toString(num) + " is " + ((num % 2 == 0) ? "even" : "odd"));
        }

        // switch
        ELevel currentWorld = ELevel.SEA_LAND;

        switch (currentWorld) {
            case ELevel.GRASS_LAND:
                System.out.println("Grass Land");
                break;
            case ELevel.SEA_LAND:
                System.out.println("Sea Land");
                break;
            default:
                System.out.println("Other Land");
        }

        // while loop
        int counter = 5;

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }

        Student student1 = new Student(19, "Pia", false, "CS");
        System.out.println(student1);

        System.out.println(person1.getGreeting());
        System.out.println(student1.getGreeting());

        // polymorphism
        Student student2 = new Student(21, "Alf", true, "Math");
        Student student3 = new Student(24, "Ulf", true, "Astronomy");
        System.out.println(student2.getMajor());
        System.out.println(student3.getMajor());

        Person[] persons = new Person[2];
        // implicit upcast
        persons[0] = student2;
        persons[1] = student3;
        System.out.println(persons[0].getGreeting()); // @Override = "true-sight spell"
        persons[0] = person1; // { Ella <- Person, Ulf <- Student }

        for (Person person : persons) {
            if (person.getType() == ETypes.STUDENT) {
                Student currentStudent = (Student) person; // explicit downcast
                System.out.println(currentStudent.getMajor());
            }
        }

        // interfaces
        ISwim[] swimThings = new ISwim[2];
        swimThings[0] = new Fish("Nemo", true);
        swimThings[1] = new Dolphin("Flipper");

        for (ISwim swimThing : swimThings) {
            System.out.println(swimThing.swimARound());
            System.out.println(swimThing.sayHello());
        }

        // generics
        Integer[] nums = { 1, 2, 3 };
        Adder<Integer> adder1 = new Adder<Integer>(nums); // ! references for generics
        System.out.println((int) adder1.getSum());

        // Optional
        PersonList personList = new PersonList();
        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);

        // Optional.of() = creates box
        // Optional.get() = gets content in box
        // Optional.empty() = null in box

        if (personList.findPersonByName("Ella").isPresent()) {
            System.out.println("Person found");
        } else {
            System.out.println("Person not found");
        }

        // generics example 2
        MediaShelf<Book> bookShelf = new MediaShelf<>(2);
        MediaShelf<Film> filmShelf = new MediaShelf<>(2);

        Book book1 = new Book("Die drei ???", 2000);
        Book book2 = new Book("Romeo und Julia", 1900);

        Film film1 = new Film("Titanic", 1000000);
        Film film2 = new Film("Mission Impossible", 250);

        bookShelf.push(book1);
        bookShelf.push(book2);
        filmShelf.push(film1);
        filmShelf.push(film2);

        System.out.println((bookShelf.getMedia(0).isPresent())? bookShelf.getMedia(0).get() : "not available");
        System.out.println((filmShelf.getMedia(1).isPresent())? filmShelf.getMedia(1).get() : "not available");

        // try catch finally
        int favNumber;

        Scanner scanner = new Scanner(System.in);

        try {
            favNumber = scanner.nextInt();
            System.out.println("My favorite number is: " + favNumber);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }

        System.out.println(Main.getANumber());

        int[] sortedNums = { 3, 2, 1 };
        Arrays.sort(sortedNums);

        for (int num : sortedNums) {
            System.out.println(num);
        }
    }
}
