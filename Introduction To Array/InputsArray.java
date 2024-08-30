package com.arun.Lessons.Arrays;

import java.util.Scanner;

public class InputsArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] age = new int[size];
//        System.out.println(age);

        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter the element for the index " + i +" : ");
            age[i] = in.nextInt();
        }

        System.out.println("Printing the data using for loop: ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the data using enhanced for (each) loop: ");
        for(int x : age){
            System.out.print(x + " ");
        }
    }
}
