package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_sort_string {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort_string("hi12392")));
        System.out.println(Arrays.toString(sort_string("p2o4i8gj2")));
        System.out.println(Arrays.toString(sort_string("abcde0")));
        System.out.println("=========================================");
        System.out.println(Arrays.toString(sort_string_2("hi12392")));
        System.out.println(Arrays.toString(sort_string_2("p2o4i8gj2")));
        System.out.println(Arrays.toString(sort_string_2("abcde0")));
    }

    private static int[] sort_string(String str) {
        List<Integer> resultArr = new ArrayList<>();
        for(int i = 0 ; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                resultArr.add(Character.getNumericValue(str.charAt(i)));
            }
        }
        return resultArr.stream().sorted().mapToInt(i->i).toArray();
    }

    private static int[] sort_string_2(String str) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            char characterData = str.charAt(i);
            if (Character.isDigit(characterData)) {
                String stringData = String.valueOf(characterData);
                list.add(stringData);
            }
        }
        // String 배열을 int 배열로 변환하기 (Integer::parseInt)
        return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
    }
}