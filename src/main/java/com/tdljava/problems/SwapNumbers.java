package com.tdljava.problems;

public class SwapNumbers {

    public static void main(String[] args) {
        System.out.println("Swap 2 numbers");

        int a = 10;
        int b = 30;

        //Code goes here.....
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is : [" + a + "]");
        System.out.println("b is : [" + b + "]");
    }
}
