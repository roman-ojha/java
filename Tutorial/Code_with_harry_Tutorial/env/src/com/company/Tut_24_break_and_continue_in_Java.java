package com.company;

public class Tut_24_break_and_continue_in_Java {
    public static void main(String[] args) {
        // Break and continue using loop:

            // break Statement
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                System.out.println("Java is great");
                if(i==2)
                {
                    System.out.println("Ending the loop");
                    break;
                }
            }

            // Continue Statement
            for(int i=0;i<5;i++)
            {
                if(i==2)
                {
                    System.out.println("Ending the loop");
                    continue;
                }
                System.out.println(i);
                System.out.println("Java is great");
            }
    }
}
