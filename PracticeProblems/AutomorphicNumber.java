package com.arun.PracticeProblems;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to check : ");
            long n = in.nextLong();
            long inputDigit = digitsCount(n);
            long squareNumber = n * n;
            long ans = squareNumber % (long) Math.pow(10,inputDigit);

            if(n == ans){
                System.out.println("Automorphic number");
            }else{
                System.out.println("Not an Automorphic number");
            }
        }
    }

    static long digitsCount(long squareNumber) { // 625
        long temp = squareNumber;
        int count = 0;
        while(temp > 0){
            temp/=10;
            count++;
        }
        return  count;
    }
}
