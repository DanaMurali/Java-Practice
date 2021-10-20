package com.darania.question1;

/*1 - Create a class that models a person with the following characteristics.
        - firstName
        - lastName
        - gender
        - dateOfBirth
        Then create 2 objects. one male and one female using a constructor that has all properties.
        */

import java.time.LocalDate;

public class Person {

    //instance variable
    private String firstName;
    private String lastName;
    private Gender gender;
    private int dateOfBirth;

    //Person Constructor - automatically runs when class is called

    public Person(String firstName, String lastName, Gender gender, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
