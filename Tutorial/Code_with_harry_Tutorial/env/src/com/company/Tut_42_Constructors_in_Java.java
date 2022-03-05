package com.company;

// so here we have to change the make of the class
// because we had already make the class name 'myEmployee'
// so, they are in the same package we have to make the different class name
class myMainEmployee{
    private int id;
    private String name;
    public void setName(String y){
        name=y;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

    // constructor ---------------------
    // default constructor
    public myMainEmployee(){}

    // parameterized constructor
    public myMainEmployee(int i, String n){
        id=i;
        name=n;
    }
}

public class Tut_42_Constructors_in_Java {
    public static void main(String[] args) {
        myMainEmployee Object1=new myMainEmployee();
        Object1.setId(12);
        Object1.setName("Roman");
        System.out.println(Object1.getName() +"\n"+Object1.getId());

        // constructor will automatically invoke while you are making an object
        myMainEmployee Object2=new myMainEmployee(23,"Ojha");
        System.out.println(Object2.getName() +"\n"+Object2.getId());
    }
}
