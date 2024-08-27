package com.arun.PracticeProblems;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            int n = in.nextInt();
            int ans = isMagic(n);
            System.out.println(ans);
            int prevAns = -1;
            while(ans!=1){
                if (ans == prevAns){
                    break;
                }else{
                    prevAns = ans;
                    ans = isMagic(ans);
                }
            }
            if(ans == 1){
                System.out.println("Magic number");
            }else {
                System.out.println("Not a Magic Number");
            }
        }
    }

    static int isMagic(int n) {
        int rem = 0;
        int sum = 0;
        int temp = n;
        while (temp > 0){
            rem = temp % 10;
            sum+=rem;
            temp/=10;
        }
        return sum;
    }
}
