//package com.company;
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("The sum of the three number is: ");
//        int num1=54;
//        int num2=43;
//        int num3=65;
//        int sum=num1+num2+num3;
//        System.out.println(sum);
//    }
//}


package com.company;

public class Main
{

    static int sum(int a,int b) {
        return a+b;
    }
    public static void main(String[] args)
    {
        int a,b,c;
        a=2;
        b=6;
        c=sum(a,b);
        System.out.println(c);
    }
}
