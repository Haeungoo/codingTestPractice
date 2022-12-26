package org.example;

import java.util.Arrays;

public class Programmers_Lv0_3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(odd_num_array(10)));
        System.out.println(Arrays.toString(odd_num_array(15)));

    }

    private static int[] odd_num_array(int n) {
        int[] answer;
        if(n%2==0){
            answer = new int[n/2];
            for(int j = 0; j < n/2; j++){
                answer[j] = 2*j+1;
            }
        }else{
            answer = new int[n/2+1];
            for(int i = 0; i < n/2+1; i++){
                answer[i] = 2*i + 1;
            }
        }

        return answer;
    }
}