package com.company;

class Phone{
    public void on(){
        System.out.println("Turning on Phone....");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}

class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning on SmartPhone....");
    }
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
}

public class Tut_49_Dynamic_Method_Dispatch_in_Java {
    public static void main(String[] args) {
        Phone obj1=new Phone();
        obj1.on();
        SmartPhone smobj=new SmartPhone();

        Phone obj2=new SmartPhone();
        // we can be able to do this
        // but you can be able to point derived class to the bass class
        obj2.greet();
        obj2.on();
        // here the derived class method will run
        // this process is called runtime polymorphism
        // this object will create while in runtime
        // super class = new sub class -> allowed
        // sub class =new super class -> not allowed
        // obj2.swagat();
        // NOTE: this is also not allowed because we are referencing from base class then,
        // only those method that are defined in base class are allowed
        // this is called as dynamic method dispatch
        // where java decide which method will run and executed
    }
}
