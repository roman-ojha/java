package com.company;

public class Tut_34_Recursion_in_Java {
    static int factorial(int n){
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        int fact;
        fact=factorial(n);
        System.out.println("The Factorial of n is: "+fact);
    }
}
