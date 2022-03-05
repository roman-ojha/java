package com.company;

import java.util.Scanner;
// this is the scanner class which we just import so that we can be able to use it

public class Tut_05_Getting_User_Input_in_Java {
    public static void main(String[] args) {
        //Shortcut to print: sout
        System.out.println("Taking input from the user");

        Scanner sc = new Scanner(System.in);
            // and here 'System.in' means we want to take an input from the keyboard
            // scanner class has a lot of methods to read the data from the keyboard
            // here now 'sc' is an object because of that we can be able to use it's methods and property

        System.out.print("Enter number 1: ");
//        int num1=sc.nextInt();
        // here we are trying to take integer input
        float num1=sc.nextFloat();
        // here we are trying to take float input


        System.out.print("Enter number 2: ");
//        int num2=sc.nextInt();
        float num2=sc.nextFloat();

//        int sum=num1+num2;
        float sum=num1+num2;

        System.out.print("The sum of the number is:");
        System.out.println(sum);

        System.out.print("Enter the number to check whether the given number is integer or not: ");
        boolean b=sc.hasNextInt();
            // in this case we are checking where the entered number is integer or not
        System.out.println(b);

        String str1=sc.next();
            // now it will take an string but it will take string up tp white space
        System.out.println(str1);

        String str2=sc.nextLine();
            // now this will take all the string including white space
        System.out.println(str2);
    }
}
