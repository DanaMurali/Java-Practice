package com.darania.question2;

/*2 - Model a car garage using classes. Use your imagination and think about the properties and behaviours. Note that you might want to create 2 classes. One for Garage and another for Car. The garage holds a list/array of cars....*/

import java.util.Scanner;

public class Garage {

    public static void main(String[] args) {

        Car toyota = new Car(
                "Toyota",
                "Mustard Yellow",
                "LC12 YKT"
        );

        Car bmw = new Car(
                "BMW",
                "Ruby Black",
                "SW19 JGT"
        );

        Car ford = new Car(
                "Ford",
                "Forest Green",
                "LD20 CDR"
        );

        Car mini = new Car(
                "Ford",
                "Cotton Candy Pink",
                "VR54 RDX"
        );

        Car jeep = new Car(
                "Jeep",
                "Charcoal Black",
                "JJ45 ZRC"
        );

        Car [] cars = {toyota, bmw, ford, mini, jeep};

        System.out.println(toyota.getCarColor());
        System.out.println(bmw.getNumPlate());
        System.out.println(ford.getCarColor());
    }

}
