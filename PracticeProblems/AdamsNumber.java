package com.arun.PracticeProblems;

/*
Adam number is a number when reversed,
the square of the number and the square of the reversed number
should be numbers which are reverse of each other
 */

import java.util.*;


public class AdamsNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt(); // n=12

        int reverseOriginal = reverse(n); // 21
        int squareOriginal = squareNumber(n); // 144
        int squareReversed = squareNumber(reverseOriginal); // 441
        int reverseSquareReversed = reverse(squareReversed);
        if(squareOriginal == reverseSquareReversed){
            System.out.println("Adams Number");
        }else {
            System.out.println("Not an Adams Number");
        }
    }

    //reverse function
     static int reverse(int n) {
         int rem=0;
         int rev=0;
         int temp=n;
         while(temp>0){
             rem = temp%10;
             rev=rev*10+rem;
             temp/=10;
         }
        return rev;
    }

    //square function
    static int squareNumber(int n){
        return n*n;
    }


}
