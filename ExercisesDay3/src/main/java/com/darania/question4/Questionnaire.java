package com.darania.question4;

/*4 - Create a survey questionnaire application that saves users answers to a file. Think about the classes and that you might need. For example,
Questionnaire:
        - id, createdAt, List of Questions
Question:
        - the question
Person:
        - name, email, dob*/

import java.util.Scanner;

public class Questionnaire {

    public static void main(String[] args) {

        // Three questions were stored in string variables

        String question1 = "What is the moon made up of?\n" + "(a)All the cheese you can eat!\n(b)Loads of rocks and metals\n(c)It's just a big light bulb...";

        String question2 = "Who is the unabomber?\n" + "(a)Ted Kaczynski\n(b)Pablo Escobar\n(c)Al Capone";

        String question3 = "Where did Bilbo Baggins go on his adventure?\n" + "(a)He teleported to another dimension.\n(b)He went to a mean girls themed spa holiday!\n(c)He journeyed to the Lonely Mountain to battle a dragon.";

        //store the 3 questions in array.
        Question [] questions = {
                new Question (question1, "b"),
                new Question (question2, "a"),
                new Question (question3, "c")
        };
        takeTest(questions);

    }
    //take Test Method: accepting a parameter with an array of questions.
    public static void takeTest (Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        //looping through all the questions in array. Going through each prompt.
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();

            //if loop to check if the user's answer was correct.
            if(answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);

            Scanner name = new Scanner(System.in);
            System.out.println("Please enter your name:");
            String input1 = name.nextLine();

            Scanner email = new Scanner(System.in);
            System.out.println("Please enter your email:");
            String input2 = email.nextLine();

            Scanner dateOfBirth = new Scanner(System.in);
            System.out.println("Please enter your Date Of Birth:");
            String input3 = dateOfBirth.nextLine();

        }
    }

    //store details of person and test results in database.


