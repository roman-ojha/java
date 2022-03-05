package com.company;
import java.util.Scanner;

/*
*   Write a program to calculate percentage of a given student in CBSE bord exam.
    His marks from 5 subjects must be taken as input from the keyboard (marks are out of 100)
 */

public class Tut_06_Exercise_1_CBSE_Board_Percentage_Calculator {
    public static void main(String[] args) {
    float math,physic,chemistry,biology,english;
    float percentage;
    Scanner res=new Scanner(System.in);
    System.out.println("Enter the Marks of all the subject:");
    System.out.print("Math: ");
    math=res.nextInt();
    System.out.print("Physic: ");
    physic=res.nextInt();
    System.out.print("Chemistry: ");
    chemistry=res.nextInt();
    System.out.print("Biology: ");
    biology=res.nextInt();
    System.out.print("English: ");
    english=res.nextInt();
    percentage=(((math+physic+chemistry+biology+english)/500)*100);
    System.out.print("Total: "+(math+physic+chemistry+biology+english)+"\nPercentage: "+percentage+"%");
    }
}
