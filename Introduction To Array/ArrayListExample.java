package com.arun.Lessons.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax

        ArrayList<Integer> list = new ArrayList<>(5);
//
//        //adding elements to list
//
//        list.add(10);
//        list.add(20);
//        list.add(130);
//        list.add(14350);
//        list.add(2342);
//        list.add(654);
//
//        // no need of toString method here(will see in detail about toString in the oops concepts)
//        System.out.println(list);
//
//        //change values in the list
//        list.set(0,70);
//        System.out.println(list);
//
//        //remove an element in the list
//        list.remove(0);
//        System.out.println(list);
//
//        //returning list size
//        System.out.println(list.size());
//
//        //contains
//        System.out.println(list.contains(130)); // true
//
//        //get method in ArrayList
//        System.out.println(list.get(1));

        //using for loop input and output

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // printing using for loop

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // list[index] won't work here!
        }

    }
}
