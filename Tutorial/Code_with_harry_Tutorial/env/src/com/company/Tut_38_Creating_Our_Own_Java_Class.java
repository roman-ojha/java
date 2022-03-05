package com.company;


// here we don't use public for other class
// because in one java file we only have one public class
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Tut_38_Creating_Our_Own_Java_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // Instantiation a new Employee Object
        Employee roman=new Employee();

        // Setting Properties/Attributes
        roman.id=12;
        roman.name="Roman";
        roman.salary=30000;
        System.out.println(roman.id);
        System.out.println(roman.name);

        // now we can be able to use this to access method
        roman.printDetails();

        // Making new object
        Employee ojha=new Employee();
        ojha.id=13;
        ojha.name="Razz";
        ojha.salary=40000;
        ojha.printDetails();
        int salary= ojha.getSalary();
        System.out.println("My salary is: "+salary);
    }
}
