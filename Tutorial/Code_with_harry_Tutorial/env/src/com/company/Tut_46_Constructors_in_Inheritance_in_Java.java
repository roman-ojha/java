package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Base class constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded Base class constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        // so, if we want to call 'Base1(int a)' constructor then we have to define that in here
        super(0);
        // if we will not use super keyword then it will automatically call default constructor
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded Derived class constructor with value of y as: "+y);
    }
}

class ChildOfDerived extends Derived1{
        ChildOfDerived(){
            System.out.println("I am a Child Of Derived class constructor");
        }
        ChildOfDerived(int x,int y,int z)
        {
            super(x,y);
            System.out.println("I am a overloaded child of Derived class constructor with value of y as: "+z);
        }

}

public class Tut_46_Constructors_in_Inheritance_in_Java {
    public static void main(String[] args) {
        Base1 b=new Base1();

        Derived1 d=new Derived1();
        // so, while making an 'Derived1' Class Object if we will not make a constructor in 'Derived1'
        // then it will automatically call the 'Base1' Constructor
        // Because we have inherit 'Derived1' from 'Base1'
        // but also, if we will make a constructor of the derived class then also by default constructor of 'Base1' will also call
        // step 01 -> 'Base1' Constructor call
        // Step 02 -> 'Derived1' Constructor call
        System.out.println("\n");
        Derived1 de=new Derived1(1,2);

        System.out.println("\n");
        ChildOfDerived c=new ChildOfDerived();

        System.out.println("\n");
        ChildOfDerived ch=new ChildOfDerived(1,2,3);
    }
}
