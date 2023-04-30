package com.tdljava.problems;

public class MaxOfTwoNumbers {

    public static void main(String[] args) {
        int a = 83;
        int b = 47;

        int maxValue = 0;

        //Code goes here

        // if a is greater then b maxValue will get the value of a
        if( a > b ) {
            maxValue = a;
        }
        else {
            // if a is less then b maxValue will get the value of b
            maxValue = b;
        }
        //

        System.out.println("Max value is: [" + maxValue + "]");
    }
}
