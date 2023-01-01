package org.example.programmers;

import java.util.Arrays;

public class Lv0_string_array_length {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(string_array_length(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(string_array_length_2(new String[]{"I", "Love", "Programmers."})));
    }

    private static int[] string_array_length(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    private static int[] string_array_length_2(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }



}