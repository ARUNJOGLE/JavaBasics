package com.arun.PracticeProblems;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number: ");
            int a = in.nextInt();
            if (a==100){
                System.out.println("Exiting...");
                break;
            }
            PrimeCheck(a);
        }
    }

    static void PrimeCheck(int n){
        if(n==0 || n==1){
            System.out.println(n + " is not a Prime Number.");
        }
        else if (n<0){
            System.out.println(n + " is a negative number.Try positive numbers.");
        }

        else{
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n + " is a Prime Number");
            }
            else {
                System.out.println(n + " is not a Prime Number");
            }
        }
    }
}
