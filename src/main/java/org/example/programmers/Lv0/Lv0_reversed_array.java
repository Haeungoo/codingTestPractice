package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_reversed_array {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3, 4, 5})));
    }

    private static int[] reversedArray(int[] array) {
        int[] reverseArr = new int[array.length];
        for(int i = array.length-1, j = 0; i >= 0; i--, j++){
            reverseArr[j] = array[i];
        }
        return reverseArr;
    }

}