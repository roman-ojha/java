package javaapplication1.Package1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab
 */
public class Student {
    int roll;
    String name, college;
    public Student(int roll, String name, String college){
        System.out.println("Student Class in Package 1");
        this.roll=roll;
        this.name = name;
        this.college = college;
    }
    
    public void display(){
        System.out.println("Roll: "+this.roll);
        System.out.println("Name: "+this.name);
        System.out.println("College: "+this.college);
    }
}
