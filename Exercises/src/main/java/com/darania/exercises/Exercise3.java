package com.darania.exercises;

/*Exercise 3
        ==========
        Write a program that takes an input from the user.
        Either yes or no. If yes it displays a random joke and
        asks the same question. If no exit the program.
*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yes or No?");
        String input = scanner.nextLine();

        if (input.equals("yes")) {
            System.out.println("Why did the M&M go to school? He wanted to be a Smartie.");
            System.out.println("Yes or No?");
            String input2 = scanner.nextLine();
             if (input2.equals("no")) {
                 System.out.println("System Exploded!");
             } else if (input2.equals("yes")){
                 System.out.println("No more Jokes...!");
             }
        } else if (input.equals("no")) {
            System.out.println("Fine then! T^T");
        }
    }
}
