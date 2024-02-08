/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit1advancedjavaprogramming;

/**
 *
 * @author razzr
 */
public class SingleDArray {
    public SingleDArray(){
        int[] nums = new int[]{1,2,3,4,5};
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        System.out.println("Sum = "+sum);
    }
}
