package com.company;

public class Tut_10_Type_of_Expressions_and_Increment_Decrement_Operators {
    public static void main(String[] args) {
        int a=654+6; //in here we can see that we are assigning expression it means the value of number could be anything
        // so in this case by doing sum the value of the expression is going to be integer to
        float x=35;
        int y=4;
        float b=65f+x/y;
        // but in this case the result value will be in float
        System.out.println(a);
        System.out.println(b);

        // Increment and Decrement Operator
        int i=43;
        System.out.println(i++);
        // in here first 'i' will print and after that i will increment
        System.out.println(i);

        System.out.println(++i);
        // but in this case first 'i' will be increment
        System.out.println(i);

        int num=7;
        System.out.println(++num*8);
        // precedence pf increment and decrement operator are greater then multiplication.
    }
}
