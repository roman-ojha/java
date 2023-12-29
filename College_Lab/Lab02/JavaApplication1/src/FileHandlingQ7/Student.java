/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandlingQ7;
import java.io.*;

/**
 *
 * @author Lab
 */
public class Student implements Serializable {
    int roll;
    String address;
    long phone;
    public Student(int roll, String address, long phone){
        this.roll=roll;
        this.address = address;
        this.phone = phone;
    }
    
    public void display(){
        System.out.println("Roll: "+this.roll);
        System.out.println("Address: "+this.address);
        System.out.println("Phone: "+this.phone);
    }
}
