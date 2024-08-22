package com.arun.PracticeProblems;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice == 1) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            tables(n);
            System.out.println("---------------------------");

            System.out.print("Press 1 to continue or 0 to exit: ");
            choice = in.nextInt();
        }
    }

    static void tables(int n){
            int ans;
            int i=1;
            do {
                ans = i * n;
                System.out.println(i + " * " + n + " = " + ans);
                i++;
            } while (ans % 2 != 0);
        }
}
