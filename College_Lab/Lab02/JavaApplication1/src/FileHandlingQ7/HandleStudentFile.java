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
public class HandleStudentFile {
    public HandleStudentFile(){
        String filePath = System.getProperty("user.dir")+"\\student.txt";
        Student s1 = new Student(1, "Jhapa", 98233343);
        Student s2 = new Student(2, "Kritipur", 98432123);
        Student s3 = new Student(3, "Lalitpur", 98675434);
        Student[] s = {s1,s2, s3};
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(s);
            out.close();
            fos.close();
            
            // Read
            FileInputStream fin = new FileInputStream(filePath);
            ObjectInputStream oin = new ObjectInputStream(fin);
            Student[] fStudents = (Student[])oin.readObject();
            for(int i=0;i<fStudents.length;i++){
                if(fStudents[i].address.equals("Kritipur")){
                    fStudents[i].display();
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
