package com.arun;

public class PassingExample {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }

     static void swap(int a, int b) {
        int t=a;
        a=b;
        b=t;
    }

}
