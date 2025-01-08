package org.example;

public class Person {
    //instance variables
    private String firstName;
    private String lastName;
    private int age;
    private  String hobbies;
    private String skills;
    private double kilo;

    //constructors
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String hobbies, String skills, double kilo) {
        this.hobbies = hobbies;
        this.skills = skills;
        this.kilo = kilo;
    }

    public Person(String firstName, String lastName, int age, String hobbies, String skills, double kilo) {
        this(firstName, lastName, age);
        this.hobbies = hobbies;
        this.skills = skills;
        this.kilo = kilo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public Integer getAge () {
        return age;
    }

    public boolean isTeen () {
        return age >= 13 && age <= 19;
    }


}
