package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class DrawTriangle {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter size: ");
        int size = Integer.parseInt(reader.readLine());

        for (int i=1; i<= size; i++) {
            for (int j=1; j<= size; j++) {
                if(j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}

//    public static void drawTriangle(String s, int size) {
//
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                System.out.print(s);
//                System.out.println();
//            }
//        }
//    }


