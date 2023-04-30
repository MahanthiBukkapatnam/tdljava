package com.tdljava.problems;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 5;

        int maxValue = 0;

        //Code goes here
        maxValue = maxOfTwoNumbers(a, maxOfTwoNumbers(b, maxOfTwoNumbers(c,d) ) );

        System.out.println("Max value is: [" + maxValue + "]");
    }

    static int maxOfTwoNumbers(int a, int b) {
        if( a > b ) {
            return a;
        }
        else {
            return b;
        }
    }
}
