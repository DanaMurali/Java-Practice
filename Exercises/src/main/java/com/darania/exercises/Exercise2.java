package com.darania.exercises;

/* Exercise 2
        ==========
        Write a program that adds total amount for this
        string "0.90, 1.00, 9.00, 8.78, 0.01" and
        either print a decimal or BigDecimal
*/

public class Exercise2 {
    public static void main(String[] args) {

        String string = "0.90, 1.00, 9.00, 8.78, 0.01";
        //Split the string
        String numbers [] = string.split(",");
        double sum = 0;
        //for loop
        for (String number : numbers) {
            var n = Double.parseDouble(number);
            sum += n;
        }
        //print sum
        System.out.println(sum);



    }
}
