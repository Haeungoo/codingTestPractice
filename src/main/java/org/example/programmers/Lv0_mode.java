package org.example.programmers;

import java.util.*;

public class Lv0_mode {

    private final static int[] test1 = {1,2,3,3,3,4};
    private final static int[] test2 = {1,1,2,2};
    private final static int[] test3 = {1};

    public static void main(String[] args) {
        System.out.println(frequent_num(test1));
        System.out.println(frequent_num(test2));
        System.out.println(frequent_num(test3));

    }

    private static int frequent_num(int[] n) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number: n){
            int count = map.getOrDefault(number,0)+1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else if(count == maxCount){
                answer = -1;
            }
            map.put(number,count);
        }
        return answer;

    }
}