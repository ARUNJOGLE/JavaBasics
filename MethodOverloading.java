package com.arun;
// overloading --> compile time , same fn name, diff arguments or different return type
public class MethodOverloading {
    public static void main(String[] args) {
        fun(23);
        fun("Jogle");
        addNum(1,2);
        addNum(1,2,3);
        addNum(1,2,4,5);
    }

    static void fun(int age) {
        System.out.println(age);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void addNum(int a,int b){
        System.out.println(a+b);
    }

    static void addNum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    static void addNum(int a,int b,int c, int d){
        System.out.println(a+b+c+d);
    }


}
