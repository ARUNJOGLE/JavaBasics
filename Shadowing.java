package com.arun;

public class Shadowing {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        display();
        x=40;
        display();
        System.out.println(x);
        int x;
//        System.out.println(x); --> Scope will begin when value is initialised!!
        x= 20;
        System.out.println(x);
    }

    static void display(){
        System.out.println(x);
    }
}
