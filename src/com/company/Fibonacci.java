package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        int result = fib(4);
        System.out.println(result);

    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
