package com.company;

public class Tut_23_The_for_Loop_in_Java {
    public static void main(String[] args) {

        // for Loop
        for(int i=0;i<=10;i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\n");

        // odd number
        int n=5;
        System.out.print("Odd number are: ");
        for (int i=0;i<=n;i++)
        {
            System.out.print(2*i+1);
            System.out.print(" ");
        }
        System.out.print("\n");

        for(int i=5;i>0;i--)
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}
