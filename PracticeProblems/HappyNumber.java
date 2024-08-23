package com.arun.PracticeProblems;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to check : ");
            int n = in.nextInt(); // let say input n: 19

            int squareDigit = squareDigits(n); // 82 // 64 // 1

            while (squareDigit != 1 && n != 0) { // 82 != 1 // 64 != 1 // 1 != 1 false
                squareDigit = squareDigits(squareDigit); // 82 // 64 // skip

            }

            if (squareDigit == 1) { // 1 == 1 // true
                System.out.println(n + " is a Happy Number");
            } else {
                System.out.println(n + " is not a Happy Number");
            }

        }
    }

    static int squareDigits(int n) { // n:19 // 82 // 64
        int rem=0;
        int iSquare=0;
        while(n>0){ // 19 > 0 condition true
                rem = n % 10; // getting individual digits
                iSquare += (rem * rem); // 81 + 1 = 82 //works until isSquare reaching 1
                n /= 10; // getting square of next digit
            }
        return iSquare; // 82 // 64 // 1 // exiting function
    }
}
