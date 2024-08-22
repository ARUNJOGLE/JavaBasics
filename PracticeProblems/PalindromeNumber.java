package com.arun.PracticeProblems;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int from = in.nextInt();
        int to = in.nextInt();
        for(int i= from ; i<=to;i++){
            int rev = reverse(i);
            if(i==rev){
                System.out.print(i+" ");
            }
        }
    }


    static int reverse(int n){
        int rev = 0;
        int rem = 0;

        while(n>0){
            rem=n%10;
            rev = rev * 10 + rem;
            n=n/10;
        }
        return rev;
    }
}