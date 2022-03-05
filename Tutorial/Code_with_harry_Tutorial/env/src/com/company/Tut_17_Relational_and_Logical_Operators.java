package com.company;

public class Tut_17_Relational_and_Logical_Operators {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=false;

        // logical AND
        System.out.println("Logical AND");
        if(a && b)
        {
            // when a = true and b = true
            System.out.println("Y");
        }
        else
        {
            // when a = true and b = false
            // when a = false and b = true
            // when a = false and b = false
            System.out.println("N");
        }
        if(a && b && c)
        // this will calculate using associativity
        {
            // when a = true and b = true and c = true
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        // Logical OR
        System.out.println("Logical OR");
        if(a||b)
        {
            // when a = ture or b = false
            // when a = false or b = true
            // when a = ture or b = true
            System.out.println("Y");

        }
        else
        {
            // when a = false or b = false
            System.out.println("N");
        }

        // Logical NOT
        System.out.println("Logical NOT");
        System.out.print("NOT of A: ");
        System.out.println(!a);
        System.out.print("NOT of B: ");
        System.out.println(!b);
    }
}
