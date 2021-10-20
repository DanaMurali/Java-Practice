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
        //Split the string and store in array called numbers
        String numbers [] = string.split(",");
        //something to keep track of the sum so initialize to 0
        double sum = 0;
        //for loop through it
        for (String number : numbers) {
            //these are decimal numbers so have to use Double.parseDouble
            var n = Double.parseDouble(number);
            //sum = sum + n
            sum += n;
        }
        //print sum
        System.out.println(sum);



    }
}
