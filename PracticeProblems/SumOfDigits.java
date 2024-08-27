package com.arun.PracticeProblems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number : ");
            int n = in.nextInt();
            int ans = sumDigits(n);
            System.out.println("The sum of the digits from " + n + " is : " + ans);
        }
    }

    static int sumDigits(int n) {
        int sum = 0;
        int rem = 0;
        while(n>0){
            rem = n % 10;
            sum += rem;
            n/=10;
        }
        return sum;
    }
}
