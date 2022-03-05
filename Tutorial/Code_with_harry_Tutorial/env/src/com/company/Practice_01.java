package com.company;

import java.util.Scanner;

class Complex{
    private int a,b;
    public void setData(int x,int y){
        a=x;
        b=y;
    }
    public void calculation(Complex c1,Complex c2){
        a=c1.a+c2.a;
        b=c1.b+c2.b;
    }
    public void printData(){
        System.out.println("A: "+a+"\nB:"+b);
    }
}

public class Practice_01{
//    void Comparision(int a,int b){
//        if (a>b){
//            System.out.println("A is greater then b");
//        }
//        else{
//            System.out.println("B is greater then A");
//        }
//    }

    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String firstName,lastName,fullName;
//        firstName=sc.next();
//        lastName=sc.next();
//        System.out.println("Full Name: "+firstName+" "+lastName);

//        for(int i=0;i<10;i++){
//            System.out.printf("%d ",i);
//        }

//        int []ar=new int[5];
//        int []arr1;
//
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//        Method in java:
//            int res=calculation(1,2);
//            System.out.println(res);

//        Scanner sc=new Scanner(System.in);
//        int a,b;
//        a=sc.nextInt();
//        b=sc.nextInt();
//        Practice_01 obj1=new Practice_01();
//        obj1.Comparision(a,b);

            Complex [] c=new Complex[3];
            c[0].setdata(1,2);
            c[1].setdata(3,4);
            c[2].calculation(c[0],c[1]);
            c[2].printdata();

    }
}
