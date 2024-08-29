package com.arun.PracticeProblems;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to check : ");
            int n = in.nextInt();
            isSquare(n);
        }
    }

    static void isSquare(int n) {
        int temp = (int) Math.sqrt(n);
        int tempSquare = temp * temp;
        if(tempSquare == n){
            System.out.println(n + " is a Square Number");
        }else {
            System.out.println(n + " is not a Square Number");
        }
    }
}
