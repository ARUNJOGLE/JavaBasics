package com.arun;

import java.lang.reflect.Array;
import java.util.Arrays;

//Variable Length Arguments (When don't knowing the no .of arguments)(always at the end!!)
public class VarArgs {
    public static void main(String[] args) {
        display(17,45,11,26,5,5,3,2);
        multipleArguments(10,20,"Sum" , "difference");

//        demo(); --> bringing ambiguity
        demo(1,2,3);
        demo("hi","hello");
    }

    static void display(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multipleArguments(int a, int b, String ...v){
    }
// method overloading ---> bringing ambiguity
    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }

}
