package com.arun.PracticeProblems;

import java.util.Scanner;

import static com.arun.PracticeProblems.Factorial.fact;

/*
        Strong Number
        145 --> 1! + 4! + 5! = 1 + 24 + 120 = 145
        1. digits
        2. fact(each digit)
        3. sum (all fact)
        4. check
        */
public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number to check : ");
            int n = in.nextInt();
            isStrongNUmber(n);
        }
    }

    static void isStrongNUmber(int n) {
        int temp = n;
        int rem=0,factNumber,sum=0;
        while(temp > 0){
            rem = temp % 10;
            factNumber = (int) fact(rem);
            sum+=factNumber;
            temp/=10;
        }
        if(n == sum){
            System.out.println(n + " is a Strong Number");
        }else {
            System.out.println(n + " is not a Strong Number");
        }
    }

    static int fact (int rem){
        int fact = 1;
        for (int i = 1; i <= rem ; i++) {
            fact *= i;
        }
        return fact;
    }
}
