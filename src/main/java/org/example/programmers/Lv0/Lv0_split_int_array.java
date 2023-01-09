package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_split_int_array {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copy_of_range_array(new int[]{1,2,3,4,5}, 1,3)));
    }

    private static int[] copy_of_range_array(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }


}