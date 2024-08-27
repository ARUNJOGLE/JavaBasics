package com.arun.PracticeProblems;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to check : ");
            int n = in.nextInt(); // n:19

            int temp = n; // temp : 19
            temp = squareDigit(temp); // temp : 19 --> squareDigit(19) --> return sum

            while (temp != 1 && temp != 4) { // return 1 or 4 true
                temp = squareDigit(temp);
            }
            if (temp == 1) {
                System.out.println(n + " is a Happy Number");
            } else {
                System.out.println(n + " is not a Happy Number");
            }
        }

    }

//    squareDigit Method
    static int squareDigit(int temp) {
        int rem = 0;
        int sum = 0;
        while(temp > 0){
            rem = temp % 10;
            sum+=(rem*rem);
            temp/=10;
        }
        return sum; // 1^2 + 9^2 = 1+81 = 82 (not equal to 1)
    }
}
