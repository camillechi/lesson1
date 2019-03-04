package com.company;

public class Mystery {
    public static void main(String[] args) {
        int[] array = {3, 0, 4, 6, 3};
        int k = 2;
        int result = mystery(array, k);
        System.out.println(result);


    }

    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index +  1;
        }
        return answer;
    }
}
