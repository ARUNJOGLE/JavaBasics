package com.arun.Lessons.Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){
        arr[0]=100;
    }
}
