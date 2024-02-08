/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit1advancedjavaprogramming;

/**
 *
 * @author razzr
 */
import java.util.Scanner;

public class UserInput {
    public UserInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;
        System.out.println("Sum = "+c);
    }
}
