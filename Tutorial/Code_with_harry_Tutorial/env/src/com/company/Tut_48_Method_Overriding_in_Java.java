package com.company;

class A{
    public int a;
    public int roman(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }

}

// this class B is also called as subclass of A
class B extends A{
       public void meth3(){
           System.out.println("I am method 3 of class B");
       }
       // here is the method overriding
       @Override
       // this override notation notate that you have override the function in derived class
       /*
            Rules of override:
                -> you can't override by changing the return type
                -> you can't over ride by changing the access modifier
                -> you can't override the static method
                -> you can't override by changing parameter
        */
       public void meth2(){
           System.out.println("I am method 2 of class B");
       }
}


public class Tut_48_Method_Overriding_in_Java {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
