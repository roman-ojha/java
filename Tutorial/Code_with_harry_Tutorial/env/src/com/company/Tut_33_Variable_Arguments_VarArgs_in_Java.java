package com.company;

public class Tut_33_Variable_Arguments_VarArgs_in_Java {
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }

    static int sum1(int ...arr){
        // except using method overloading we can use VarArgs
        // which will take an array what ever argument we pass to the function
        // and it will behave like:
        // int [] arr;
        int result=0;
        for (int element:arr
             ) {
            result +=element;
        }
        return result;
    }
    static int sum2(int a,int ...arr){
        // now this function accept one argument
        int result=0;
        for (int element:arr
        ) {
            result +=element;
        }
        return result+a;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 4, 5 and 5 is: "+sum(4,5,6));
        System.out.println("The sum of 2, 4, 5 and 5 is: "+sum(2,4,5,6));
        // we are making a lot of same method to do the sum operation by passing different argument

        // but to perform this operation we have another way
        System.out.println("\nThe sum of 4 and 5 is: "+sum1(4,5));
        System.out.println("The sum of 4, 5 and 5 is: "+sum1(4,5,6));
        System.out.println("The sum of 2, 4, 5 and 5 is: "+sum1(2,4,5,6));
        System.out.println("The sum of Nothing is: "+sum1());
        // here empty array will return 0

        // but if we will make compulsory to have an one argument then we can be able to do this
        System.out.println("\nThe sum of 4 and 5 is: "+sum2(4,5));
        System.out.println("The sum of 4, 5 and 5 is: "+sum2(4,5,6));
        System.out.println("The sum of 2, 4, 5 and 5 is: "+sum2(2,4,5,6));
//        System.out.println("The sum of Nothing is: "+sum2());
        // now empty argument will throw an error
    }
}
