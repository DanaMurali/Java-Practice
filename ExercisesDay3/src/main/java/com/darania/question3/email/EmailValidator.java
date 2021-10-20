package com.darania.question3.email;

/*3 - Create package called email and inside have a class called EmailValidator with one public method. This method should accept a string and perform validation check. If the email does not contain the @ sign return false; if the email is valid return true.
        Bonus: Use a Regular expressions to validate the email*/

import java.util.Objects;
import java.util.Scanner;

public class EmailValidator {

    private EmailValidator emailValidator;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your email?");
        String input = scanner.nextLine();

        if (input.contains("@")) {
            System.out.println("True!");
        } else if (!input.contains("@")) {
            System.out.println("False!");
        }

    }
}
