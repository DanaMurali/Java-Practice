package com.darania.exercises;

/*Exercise 4
        ==========
        Write a program that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo

        implement longestStrings method*/

import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args) {

        String [] mythicalCreatures = {"Unicorn", "Troll", "Dragon", "Centaur", "Amazonian Salamander", "Sphinx"};
        String longest = longestStrings(mythicalCreatures);
        System.out.println(longest);
    }

    public static String longestStrings(String[] input) {

        int index = 0;
        int element = input[0].length();
        for (int i = 1; i < input.length; i++) {
            if (input[i].length() > element) {
                index = i;
                element = input[i].length();
            }
        }
        return input[index];
    }
}
