package com.arun.Lessons.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list); // returns []

//        System.out.println(list.get(0)); // returns error : Index 0 out of bounds for length 0

        //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }


        System.out.println(list);




    }
}
