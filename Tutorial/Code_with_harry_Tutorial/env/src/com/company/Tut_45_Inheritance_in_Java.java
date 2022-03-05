package com.company;

// this is base class
class Base{
    int x;
    // we can make getter and setter in intellij idea by shortcut = 'Alt + ins'
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

// NOTE!! -> Java doesn't support multiple inheritance ie. two classes can't be super classes for a subclass
// we are deriving 'Derived' Class by inheriting from 'Base' Class
class Derived extends Base{
    // now this code of line will be replicate from the 'Base' Class
    //---------------------------------------------------------------
    //    int x;
    //    public int getX() {
    //        return x;
    //    }
    //    public void setX(int x) {
    //        this.x = x;
    //    }
    //    public void printMe(){
    //        System.out.println("I am a constructor");
    //    }
    //---------------------------------------------------------------

    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}


public class Tut_45_Inheritance_in_Java {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b=new Base();
        b.setX(5);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d=new Derived();
        // here we are able to access all method and property of the base class
        d.setX(10);
        System.out.println(d.getX());
        d.setY(15);
        System.out.println(d.getY());
    }
}
