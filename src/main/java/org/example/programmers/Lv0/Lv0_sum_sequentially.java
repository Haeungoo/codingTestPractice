package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_sum_sequentially {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sum_sequentially(3, 12)));
        System.out.println(Arrays.toString(sum_sequentially(5, 15)));
        System.out.println(Arrays.toString(sum_sequentially(4, 14)));
        System.out.println(Arrays.toString(sum_sequentially(5, 5)));
    }

    private static int[] sum_sequentially(int num, int total) {
        int[] answer = new int[num];

        int sum = num * (num+1)/2;
        int start = (total-sum)/num;

        for(int i = 1; i < num+1; i++){
            answer[i-1] = i + start;
        }

        return answer;
    }


}