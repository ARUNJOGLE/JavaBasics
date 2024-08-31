package com.arun.Lessons.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //multidimensional array
//        int[][] arr = new int[3][3];

//        //direct way
//        int[][] arr = {
//                {1, 2, 3}, // 0th index where '2' is at index[1] in oth index array!
//                {4, 5, 6}, // 1st index
//                {7, 8, 9}  // 2nd index
//        };
//
//        System.out.println("Length of arr array (only row size not column) : " + arr.length); // returns the size of row (not column)

        //getting input for a md array
//        System.out.print("Enter row and column size : ");
//        int row = in.nextInt();
//        int col = in.nextInt();

//        int[][] age = new int[3][3];
//        int row,col;
//        for (row = 0; row < age.length; row++) {
//            for (col = 0; col < age[row].length; col++) {
//                age[row][col] = in.nextInt();
//            }
//        }


//        sample md array
        int[][] age = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        //tradition way of printing md arrays
        System.out.println();
        System.out.println("Using traditional for loop");
        for (int row = 0; row < age.length; row++) {
            for (int col = 0; col < age[row].length; col++) {
                System.out.print(age[row][col] + " ");
            }
            System.out.println();
        }

        //using enhanced for each loop
        System.out.println();
        System.out.println("Using Enhance for loop");
        for(int[] dataRow : age){
            for(int dataCol : dataRow){
                System.out.print(dataCol + " ");
            }
            System.out.println();
        }


    }
}
