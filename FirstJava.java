package com.arun;

public class FirstJava {
    public static void main(String[] args) {
//        --------------------------------------Day 03 (14.08.2-24,wed)------------------------------------
        System.out.println("Basics Part 1");
//        primitives
        int age = 21;
        char gradeInTamil = 'A';
        float marks = 98.21f;
        double largeDecimalNumbers = 6549874688745746.545487855487;
        long largerInteger = 1132165468735457548L;
        boolean agreeWith = false;

        //note: wrapper classes--->OOPS Concept!
        Integer rNo=21;
        System.out.println(rNo);

//        Inputs
        int myAge = 10; // where int-->dataType myAge-->reference identifier 10-->literal
        //int myCash = 1745,000,000; replace comma with underscore
        int myCash = 1745_000_000;
        System.out.println(myCash);

//        typecasting --- > converting var's value from one dt to another dt ie, int to float --> 10 ==> 10.0
        int a = 10;
        System.out.println(a);
//        typecasting types ----> 1.widening casting(Implicit) 2. Narrowing Casting (Explicit)
        float b = a;
        System.out.println("Using 1: "+b);
        int c = (int) (10.45f);
        System.out.println("Using 2: "+c);

//        automatic type promotion in expression

        byte x=50;
        byte y=40;
        int z = (x * y);
        System.out.println("x*y is : "+z);

        byte ab=50;
//        ab=ab*10;
        int promatedVar = 'A';
        System.out.println(promatedVar); //output:65 // java accepts ascii values too :)

        System.out.println("こんにちは世界"); // java follows unicode as well

//        Promotion Rules

        /*Here are the rules for type promotion in Java:
        Byte, short, and char are promoted to int:
        When evaluating an expression with byte, short, or char operands, they are automatically promoted to int before any calculations are performed.
        If one operand is long, the whole expression is promoted to long:
        If any operand in an expression is of type long, all other operands are promoted to long as well.
        If one operand is float, the whole expression is promoted to float:
        If any operand is of type float, all other operands are promoted to float.
        If one operand is double, the whole expression is promoted to double:
        If any operand is of type double, all other operands are promoted to double.
        */
    }
}
