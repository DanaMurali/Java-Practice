import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigDecimal decimal;
        BigInteger decimal; //automatically imports to top
        //import java.math.*; <- this imports everything. Never import everything so Its specific.

        System.out.println("Hello World!");
        System.out.println("Aloha");

        String name = "Bob";
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        //We have these methods available (e.g.toUpperCase) when we have an object. These are complex data types.
        //When you want to use objects and initialise them you need to use new
        String name2 = new String("Jane");

        Point point = new Point(10,10);
        point.move(10,11);
        //java helps out with hints such as x,y. So you know which coordinates refer to which.


        BigDecimal decimal = new BigDecimal("10.00");
        System.out.println(decimal.negate());
        //Always use BigDecimal when dealing with money.
        //API is something developers made to make use of easily.

        int age = 20;
        long age2 = 20L;

        byte x = 127;

        double pi = 3.14;
        float pi2 = 3.14F;

        boolean isAdult = false;

        char letter = 'A';

        //use sout as an easy way to write but try to remember it fully for interviews.
        System.out.println(10 + 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(10 - 10);
        System.out.println(10 % 2 == 0); //trying to find if this is an even number
        System.out.println(!(10 % 2 == 0)); //same as writing 10 % 2 != 0

        //
        String name3 = new String("Helena");
        String name4 = "Helena";
        String name5 = "Helena";
        //
        System.out.println(name3.compareTo(name4));
        //returns 0
        System.out.println(name3.equals(name4));
        //returns true
        System.out.println(name3 == name4);
        //returns false
        System.out.println(name4 == name5);
        //returns true - it's not comparing the string contents but actually where in the string pool is the arrow referring to.
        //the equals sign is comparing where they are stored in memory.
        //when we define string Helena, it defines it in the string pool.
        //When it comes to strings never use ==, use .equals or .compare

        int n = 1;
        int n2 = 1;
        System.out.println(n == n2);
        //value itself is stored in the stack. Primitives are stored in the stack.
        //with objects it compares the references.

        //a is a new coordinates.
        Point a = new Point(10:10);
        Point b = new Point(10:10);
        Point c = b;

        c.x = 20;

        System.out.println(a);
        //returns 10,10
        System.out.println(b);
        //returns 20,10
        System.out.println(c);
        //returns 20,10
        // a and b are twins. but c and c are identical mirror images of each other. so if you change b, c changes too. If you change c, b changes too.
        //When you create a reference in the stack, this creates the object point in the heap.
        //Yacine also known as Nino has a phone number which points to the same reference type, if Yacine changes his phone number, then Nino's phone number changes too because Nino and Yacine are the same (i.e they share the same reference type).

        BigDecimal tenner = new BigDecimal("10");
        BigDecimal tenner2 = new BigDecimal("10");

        //never use this method to compare string:
        System.out.println(tenner == tenner2);
        //always use this method to compare strings:
        System.out.println(tenner.equals(tenner20));
        //or use this:
        System.out.println(tenner.compareTo(tenner2));
        //This would return 0 for true and 1(if tenner is bigger than tenner2) or -1(if tenner2 is bigger than tenner) for false.

        //Arrays:
        int[] number = new int[2]; // this is saying we can only have 2 elements within        the array, we can't have 3 or more elements.
        //to insert a new number into the array above.
        //in java what you have in the array is a fixed length.
        numbersa [0] = 1;
        numbersa [1] = 2;

        int[] numbers2 = {1,2};
        System.out.println(numbers.length);
        //should return 2

        //Loops
        int[] numbers = {1,2,3}

        for (int i=0; i<numbers.length;) i++ {
            System.out.println(numbers[i]);
        }

        for(int number : numbers) {
            System.out.println(number);
        }

        Arrays.stream(numbers).forEach(n -> System.out.println(n));
        //pass lambda n before printing.

        //increments:
        int x = 0;
        System.out.println(x++); //returns 0
        System.out.println(x); //returns 1

        System.out.println(++x); //returns 1
        System.out.println(x); //returns 1

        //
        System.out.println(x++); //0
        System.out.println(x--); //1
        System.out.println(--x); //-1
        System.out.println(--x); //-2
        System.out.println(x++); //-2
        System.out.println(x); //-1

        //if statements - same in js and java
        //a boolean expression going into the ()
        if (1 > 2) {
            System.out.println("true");
        } else if (1 == 0)
            System.out.println("false");

        //switch statements

        String gender = "FEMALE";

        if (gender.equals("FEMALE")) { //.equals checks the contents of the string.
            System.out.println("do something");
    }   else if (gender.equals("MALE")){
            //etc...
        }
        // Instead of this we can use a switch statement which is more straight forward.

        switch (gender) {
            case "FEMALE":
                System.out.println("female...");
                break;
            case "MALE":
                System.out.println("male...");
                break;
            default:
                System.out.println("Unknown...");
        }

        //user input
        String name = null;
        System.out.println(name);
        //Can access its name so it will print null
        //However we can't use its properties or behaviours like name.toUpperCase etc...

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        //Allows you to receive input from the console.
        //Prints "What is your name?"

        String input = scanner.nextLine(); //to read a string
        System.out.println("Hello " + input); //waiting for input in the console then prints
        //

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        input.split()
    }
    }

//normally will never use shorts or bytes as these are for embedded systems.


