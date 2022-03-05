package com.company;

import java.sql.SQLOutput;

public class Tut_32_Method_Overloading_in_Java {
    static void tellJock(){
        System.out.println("I invented a new world!\n"+ "Plagiarism!");
    }
    static void change1(int x)
    {
        x=45;
    }

    static void change2(int []arr)
    {
        arr[0]=98;
    }

    static void foo(){
        System.out.println("Good Morning Bro!");
    }

    // these two 'foo' method are totally different because we pass one argument in one and we don't pass any thing in other
    static void foo(int a){
        System.out.println("Good morning "+a+" Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+ (a+b) +" Bro!");
    }
    // Method overloading cannot be performed by changing the return type of methods
//    static void int (int a,int b){
//        System.out.println("Good morning "+ (a+b) +" Bro!");
//        return a
            // this function will throw an error rather we make different in return type or not
//    }

    public static void main(String[] args) {
        tellJock();

        // Changing the integer
        int X=87;
        change1(X);
        System.out.println("the value of X after function call: "+X);
        // it means the value will not change after the change is function

        // changing the array
        int[]marks={52,73,77,89,98,94};
        // when we make an array like this then there will make an array object
        // and 'marks' is a reference which store the address of the array
        // this rule apply to Object as well
        change2(marks);
        System.out.println("the value of marks[0] after function call: "+marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000); // Arguments are actual!
    }
}
