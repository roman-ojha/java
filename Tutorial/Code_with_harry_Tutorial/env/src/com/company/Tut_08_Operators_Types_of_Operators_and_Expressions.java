package com.company;

public class Tut_08_Operators_Types_of_Operators_and_Expressions {
    public static void main(String[] args) {
        int a=4;
        int b=6+a; // Arithmetic operator and Assignment operator
        b += 3;// Assignment operator
        System.out.println(b);
        System.out.println(6==5);
        System.out.println(6==6);
        System.out.println(56<300);// Comparison Operator
        System.out.println(64>5&&65<6); // logical operator
        System.out.println(64>5||65<6);
        System.out.println(2&3); // Bitwise Operator
        // Arithmetic operators cannot work with booleans
        // % operator can work on floats & doubles
        System.out.println(4.8%1.1);
    }
}
