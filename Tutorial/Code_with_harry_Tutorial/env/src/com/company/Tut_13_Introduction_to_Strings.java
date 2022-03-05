package com.company;
import java.util.Scanner;
public class Tut_13_Introduction_to_Strings {
    public static void main(String[] args) {
        // in java string is a class
        // in java String is in special support so we can use it as an primitive datatype as well
        String name1=new String("Roman");
        // we can name a name object like this as well
        String name2="O";
        // because of the spacial support we can use String like this as well
        System.out.println(name1+name2);
        // String are Immutable and can't be changed
        // if we want to change the string value then we can't be able to do that

        // Different Way to print in java
        // we can use the following way to print in java:
        int x=5;
        float y=6.5f;
        float z=x+y;
        System.out.print("Roman");
        System.out.println("O");
        System.out.printf("The sum of the %d and %.0f is %.2f",x,y,z);
        System.out.format("\nAN\n");

        // Get input of String
        Scanner inp=new Scanner(System.in);
        String st=inp.nextLine();
        System.out.println(st);
    }
}
