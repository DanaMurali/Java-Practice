package com.darania.exercises;

/* Exercise 1
            ==========
    Write a program that reverses an array of Strings
    Given ["you", "are", "how", "Hello"]
    Print "hello how are you?"" */

public class Exercise1 {
    public static void main(String[] args) {
        String [] greeting = {"you", "are", "how", "Hello"};
        System.out.println("Original Array:");

        for (int i = 0; i < greeting.length; i++) {
            System.out.println(greeting[i]);
        }

        System.out.println("Reversed Array:");

        for (int i = greeting.length - 1; i >= 0; i--) {
            System.out.println(greeting[i]);
        }
    }
}

//concatenate the string to print the sentence
