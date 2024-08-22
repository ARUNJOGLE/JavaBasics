package com.arun.PracticeProblems;

import java.util.Scanner;
// Armstrong number ---> 153 ===> 1^3 +  5^3 + 3^3 = 153
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("From : ");
        int from = in.nextInt();
        System.out.print("To : ");
        int to = in.nextInt();
        for (int i = from; i < to; i++) {
            if(isArmstrong(i)) System.out.print(i + " ");
        }




    }

    static Boolean isArmstrong(int n) {
        int original =n;
        int cube =0,rem=0;
        while(n>0){
            rem = n%10;
            cube += (rem * rem * rem);
            n/=10;
        }
        return original == cube;
    }

}
