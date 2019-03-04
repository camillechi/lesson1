package com.company;

public class WindowPosSum {
    public static void main(String[] args) {
        int[] a = {1,2,-3,4,5,4};
        //int[] b = {1, -1, -1, 10, 5, -1};
        int n = 3;
        int n1 = 2;
        windowSum(a,n);
        //windowSum(b, n1);

        System.out.println(java.util.Arrays.toString(a));
        //System.out.println(java.util.Arrays.toString(b));


    }

    /*
    Hint 1: Use two for loops.

    Hint 2: Use continue to skip negative values.

    Hint 3: Use break to avoid going over the end of the array.
     */

    public static void windowSum(int[] a, int n) {

        if (n > a.length) {
            return;
        }
        int sum = 0;
        for (int i=0; i < a.length; i++) {

            if(i == n-1) { // skip the
                continue;
            }
            for (int j = i; j <= i+n; j++) {
                if(j>= a.length) { // avoid going over the end of the array
                    break;
                }
                sum += a[j];

            }

            a[i] = sum;
            sum = 0;
        }
    }
}
