package org.example.programmers.Lv0;


import java.util.Arrays;

public class Lv0_array_duplicated_number {

    public static void main(String[] args) {
        System.out.println(array_duplicated_number(new int[]{1,1,2,3,4,5}, 1));
        System.out.println(array_duplicated_number(new int[]{0,2,3,4}, 1));
        System.out.println("====================================================");
        System.out.println(array_duplicated_number_stream(new int[]{1,1,2,3,4,5}, 1));
        System.out.println(array_duplicated_number_stream(new int[]{0,2,3,4}, 1));
    }

    private static int array_duplicated_number(int[] array, int n) {
        int count = 0;
        for (int j : array) {
            if (j == n) count++;
        }
        return count;
    }

    private static int array_duplicated_number_stream(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }


}