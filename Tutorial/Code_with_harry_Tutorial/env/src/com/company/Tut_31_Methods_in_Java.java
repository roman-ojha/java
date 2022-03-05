package com.company;


public class Tut_31_Methods_in_Java {
    static int logic(int x,int y)
    {
        /* so, here we are in the static main method and as per rule of java:
            -> we can't be non static method from static method
            -> we can only be able to call static method from static method
            -> and static function is not associated with object but with class
        */
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }

     int logic2(int x,int y)
    {
        /*
            -> now this function is associated with Object because it is not static method
            -> so, to call this function we have to make an object
         */
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {

        // Normal way
        int a=6;
        int b=7;
        int c;
        if(a>b)
        {
            c=a+b;
        }
        else
        {
            c=(a+b)*5;
        }
        System.out.println(c);

        // Functional way
        //-----------------------------------------------------
        // for Static function
        int a1=45;
        int b1=43;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        //-----------------------------------------------------

        //-----------------------------------------------------
        // for normal function
        Tut_31_Methods_in_Java obj=new Tut_31_Methods_in_Java();
        // so, here we are making an object using class
        c1 = obj.logic2(a1,b1);
        // here we are calling method through an object
        System.out.println(c1);
        //-----------------------------------------------------
    }
}
