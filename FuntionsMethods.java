package com.arun;

import java.util.Scanner;

public class FuntionsMethods {
    public static void main(String[] args) {
        System.out.println("Going to see about Methods in Java!...");
        System.out.println("----------using void return type----------");
        printSum();
        System.out.println("----------using int return type----------");
        int ans = add();
        System.out.println(ans);
        System.out.println("----------using String return type----------");
        String ans1 = msg();
        System.out.println(ans1);
        System.out.println("----------Passing Arguments(Numeric: Square Number)----------");
        int ans2 = squareNo(4);
        System.out.println(ans2);
        System.out.println("----------Passing Arguments(String : Greeting)----------");
        String ans3 = myGreet("ArunJogle");
        System.out.println(ans3);
    }
    /*
    function syntax:

    return type fn_name(arguments){
        body
        return statement
    }
     */


    //Q: to display whatever written in the outcome

    static void printSum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The sum is : " + (a+b));
    }

    //Q: to return the sum

    static int add(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return a+b;
    }

    //Q: to return a string type
    static String msg(){
        String text="Hello Loki! Good Morning!";
        return text;
    }

    //Q: passing the numeric arguments
    static int squareNo(int a){
        return a*a;
    }

    //Q: passing the String arguments
    static String myGreet(String name) {
        return "Hi " + name;
    }
}
