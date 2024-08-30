package com.arun.Lessons.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        /*
        What is an Array?
            In Java, an array is a data structure used to store a fixed-size collection of elements of the same type.
            It is a container object that holds a fixed number of values of a single type.
        Why we need Array?

        Array is Mutable? yes!
         */

//        Syntax of an Array
//        datatype[] var_name = new datatype[size];

        // Example : to store 5 roll numbers
        int[] rollno = new int[5];
        // or directly
        int[] rollno1 = {1,2,3,4,5};

        // here in the above --> int[] rollno; --> declaration of array. rollno is getting defined in the stack.
        // rollno = new int[5]; --> initialisation: actually here object is being created in the memory (heap)

//  Important ⚠️ : new --> a keyword used to create objects in the Heap Memory!

        // create an empty int array and print it
        int[] age = new int[10]; // [0 0 0 0 0 0 0 0 0 0]
        System.out.println(age[1]);

        // create an empty String array and print it
        String[] names = new String[10];
        System.out.println(names[0]); // null --> a special literal and doesn't have any specific return type
                                      // null --> only assigned for non primitives only such as Strings(None in python)

        // by default null --> a special value , can assign to any (by default value for --> ref var)reference type and typecast null to any kind!

        int[] myArray;
//        System.out.println(myArray);

    }
}
