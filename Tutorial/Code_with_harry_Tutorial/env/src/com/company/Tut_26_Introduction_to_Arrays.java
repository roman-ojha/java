package com.company;

public class Tut_26_Introduction_to_Arrays {
    public static void main(String[] args) {
        /* Classroom of 500 Students - You have to store marks of these 500 students
        You have 2 options:
            1) Create 500 variables
            2) Use array (recommended)
         */

        /*
        * Three ways to make an array is Java:
            1) int[] marks;
               marks=new int[5];
            2) int[] marks=new int[5];
                // In these two case we are making an array through an object
            3) int[] marks={1,2,3,4,5}
                // In these case we are not giving an size of an array but also it will work because Java automatically give size to that array
                // In these case marks array will be size of 5
         */

        // Declaration + Memory allocation
        int [] marks1=new int[5];
        // Initialization
        marks1[0]=100;
        marks1[1]=43;
        marks1[2]=64;
        marks1[3]=75;
        marks1[4]=86;
        // overriding marks[4]
        marks1[4]=34;
        // marks[5]=76; -> will throw an error
        System.out.println(marks1[4]);


        // Declaration and Memory allocation
        int[] marks2;
        // it can be use when we need a size after, according to user need
        marks2=new int[5];
        marks2[0]=100;
        marks2[1]=43;
        marks2[2]=64;
        marks2[3]=75;
        marks2[4]=86;
        System.out.println(marks2[4]);

        // Declaration and initialization
        int[]marks3={1,2,3,4,5};
        System.out.println(marks3[2]);
    }
}
