package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_dot_location {

    public static void main(String[] args) {
        System.out.println(find_dot_location(new int[]{2,4}));
    }

    private static int find_dot_location(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        }else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        }else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        }else if(dot[0] > 0 && dot[1] < 0){
            answer = 4;
        }
        return answer;
    }




}