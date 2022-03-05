package com.company;

public class Tut_27_For_Each_Loop_in_Java {
    public static void main(String[] args) {
        // Length property of an array
        int[] marks={1,2,3,4,5};
        int len=marks.length;
        System.out.println(len);

        //floating point array
        float[] marksFloat={1.2f,43.5f,43.6f,23.6f};

        // String array
        String[] name={"Roman","Harry","Razz"};
        System.out.println(name[2]);
        System.out.println(name.length);

        // Displaying array
        // Using Naive way
        System.out.print(marks[1]+" ");
        System.out.print(marks[2]+" ");
        System.out.print(marks[3]+" ");
        System.out.println(marks[4]+" ");

        // Using for loop
        for (int i=0;i<marksFloat.length;i++)
        {
            System.out.print(marksFloat[i]+" ");
            // It is called as array traversal
            // if we need the value of i as well then we have to use this for loop way rather then foreach loop
        }
        System.out.println("");

        // Using for Each
        for(String element:name)
        {
            System.out.print(element+" ");
        }
        System.out.println("");

        for(int element:marks)
        {
            System.out.print(element+" ");
        }
        System.out.println("");
    }
}
