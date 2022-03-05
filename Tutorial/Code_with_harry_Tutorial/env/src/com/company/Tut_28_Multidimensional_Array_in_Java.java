package com.company;

public class Tut_28_Multidimensional_Array_in_Java {
    public static void main(String[] args) {
        // Multidimensional 2-D array
        int[][]flats;
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        //displaying 2-D array
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[0].length;j++)
            {
                System.out.print(flats[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
