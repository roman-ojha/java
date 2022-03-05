package com.company;
/*
Anatomy of a Java Program
    * Documentation Section
        -> Suggested
    * Package Statement
        -> We have to declared that in which package this class belongs to
        -> Optional
    * Import Statements
        -> Optional
    * Interface Statements
        -> Optional
    * Class Definitions
        -> Optional
    * Main Method Class
        {
        Main Method Definition
        }
            ->Essential

 */

/*
Data Types in Java:
    -> There are Two types of Datatype
        1) Primitive Data Type ( are Intrinsic)
            -> byte, int, float, long, char, double, bool, short
            -> A byte in Java is 8 bits. It is a primitive data type, meaning it comes packaged with Java. Bytes can hold values from -128 to 127
            -> bool for True and false
            -> long for long integer
            -> double for large floating point
            -> short store integer
        2) Non Primitive Data Type ( are Derived)
            ->Will be discussed later in the course
 */

public class  Tut_03_Variables_and_Date_Types_in_Java{

    public static void main(String[] args) {
        System.out.print("The sum of the three number is: ");
        // println will also add a new line
        // but print will not add a new line
        int num1=54;
        int num2=43;
        int num3=65;
        int sum=num1+num2+num3;
        System.out.println(sum);
    }
}