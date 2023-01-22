package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_count_number_seven {

    public static void main(String[] args) {
        System.out.println(count_number_seven(new int[]{7, 77, 17}));
        System.out.println(count_number_seven(new int[]{10,29}));
    }

    private static int count_number_seven(int[] array) {
        int count = 0;
        String str = Arrays.toString(array);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7') count ++;
        }
        return count;
    }
}