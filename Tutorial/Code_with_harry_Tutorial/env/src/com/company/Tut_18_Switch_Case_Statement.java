package com.company;
import java.util.Scanner;
public class Tut_18_Switch_Case_Statement {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter you age ");
        Scanner a=new Scanner(System.in);
        age=a.nextInt();

        // Else-if ladder
        if(age>56)
        {
            System.out.println("You are experienced");
        }
        else if(age>46)
        {
            System.out.println("You are semi-experienced");
        }
        else if(age>36)
        {
            System.out.println("You are semi-semi-experienced");
        }
        else
        {
            System.out.println("You are not experienced");
        }

        // Switch Statement
        switch(age) {
            case 18:
                System.out.println("You are going to become a Adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }

        // Enhanced Switch case
        switch (age) {
            case 18 -> System.out.println("You are going to become a Adult!");
            case 23 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }
    }
}
