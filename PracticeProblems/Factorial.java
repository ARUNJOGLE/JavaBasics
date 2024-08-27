package com.arun.PracticeProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to find Factorial : ");
            long n = in.nextInt();
            long factorial = fact(n);
            System.out.println("The factorial of " + n + " is : " + factorial);
        }
    }

    static long fact(long n) {
        long fact = 1;
        for (long i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}
