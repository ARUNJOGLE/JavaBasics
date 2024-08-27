package com.arun.PracticeProblems;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number to check : ");
            int n = in.nextInt();
            int ans = isHarshad(n);
            if(ans == 0){
                System.out.println("Harshad Number");
            }else {
                System.out.println("Not a Harshad Number");
            }
        }
    }

    static int isHarshad(int n) {
        int rem =0,sum=0,temp=n;
        while(temp>0){
            rem = temp%10;
            sum+=rem;
            temp/=10;
        }
        return n%sum;
    }
}
