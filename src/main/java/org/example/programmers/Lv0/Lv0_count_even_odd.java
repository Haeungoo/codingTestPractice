package org.example.programmers.Lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lv0_count_even_odd {


    public static void main(String[] args) {
        boolean a = count_even_odd(new int[]{1, 2, 3, 4, 5}) == stream_count_even_odd(new int[]{1, 2, 3, 4, 5});
        boolean b = count_even_odd(new int[]{1, 3, 5, 7}) == stream_count_even_odd(new int[]{1, 3, 5, 7});
        System.out.println(a == b);
    }

    private static int[] count_even_odd(int[] num_list) {
        int[] answer = new int[2];
        for(int i= 0 ; i < num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }

        return answer;
    }

    private static int[] stream_count_even_odd(int[] num_list){
        return IntStream.of((int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count()).toArray();
    }
}