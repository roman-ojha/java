package com.company;

import javax.print.Doc;

class EkClass{
    int a;
    EkClass(){}
    EkClass(int a){
        this.a=a;
        // this is a way for us to reference an object of the class which is being created/referenced
    }

    public int getA() {
        return a;
    }

    public int returnOne(){
        return 1;
    }
}



class DoClass extends EkClass{
    DoClass(){
        System.out.println("I am derived class constructor");
    }
    DoClass(int x){
        super(x);
        /*
            * Super keyword ?
                -> a reference variable used to refer immediate parent class object
                -> can be used to refer immediate parent class instance variable
                -> can be used to invoke parent class methods
                -> can be used to invoke parent class constructors
        */
        System.out.println("I am overloaded derived class constructor");

    }

}

public class Tut_47_this_and_super_keyword_in_Java {
    public static void main(String[] args) {
        EkClass e=new EkClass(5);
        System.out.println(e.getA());
        DoClass d=new DoClass(10);
        System.out.println(d.getA());
    }
}
