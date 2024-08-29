package com.arun.PracticeProblems;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number to count digits: ");
            int n = in.nextInt();
            System.out.println("Enter any digit from "+ n + " to count the occurrence : ");
            int numberToCheck = in.nextInt();
            countDigits(n);
            countOccurance(n,numberToCheck);
        }
    }

    static void countDigits(int n) {
        int temp = n,count=0;
        while(temp > 0){
            temp/=10;
            count++;
        }
        System.out.println(n + " has " + count + " digits.");
    }

    static void countOccurance(int n, int checkNo) {
        int temp = n,rem=0,count=0;
        while (temp > 0){
            rem=temp%10;
            if(rem==checkNo){
                count++;
            }
            temp/=10;
        }
        System.out.println(checkNo + " has occurred " + count + " times in " + n);
    }
}
