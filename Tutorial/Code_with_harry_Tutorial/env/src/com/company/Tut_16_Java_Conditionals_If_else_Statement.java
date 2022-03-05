package com.company;

public class Tut_16_Java_Conditionals_If_else_Statement {
    public static void main(String[] args) {
        int age1=6;
        if(age1>18)
        {
            // This block will execute if it will be true
            System.out.println("Yes boy you can drive");
        }
        else{
            // IF if condition is false then this block statement will execute
            System.out.println("No boy you can't drive");
        }
        int age2=18;
        boolean cond=(age2==18);
        if(cond)
        {
            System.out.println("Yes boy you can drive");
        }
        else{
            System.out.println("No boy you can't drive");
        }
    }
}
