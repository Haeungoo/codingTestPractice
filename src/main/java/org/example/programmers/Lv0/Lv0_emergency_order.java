package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_emergency_order {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(emergency_order(new int[]{3,76,24})));
        System.out.println(Arrays.toString(emergency_order(new int[]{1,2,3,4,5,6,7})));
        System.out.println(Arrays.toString(emergency_order(new int[]{30,10,23,6,100})));
    }

    private static int[] emergency_order(int[] emergency) {
        int [] sort_arr = emergency.clone(); // Array.sort로 객체 자체가 정렬되기 때문에 clone()으로 복제
        int[] answer = new int[emergency.length];
        Arrays.sort(sort_arr);
        for(int i = 0; i <= emergency.length-1; i++){
            for(int j = 0; j <= sort_arr.length-1; j++){
                if(sort_arr[j] == emergency[i]){
                    answer[j] = emergency.length-i;
                }
            }
        }
        return answer;
    }


}