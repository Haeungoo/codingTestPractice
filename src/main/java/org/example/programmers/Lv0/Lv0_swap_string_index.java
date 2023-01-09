package org.example.programmers.Lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lv0_swap_string_index {

    public static void main(String[] args) {
        System.out.println(swap_string_index("hello", 1, 2));
        System.out.println(swap_string_index("I love you", 3, 6));
        System.out.println("=======================================================");
        System.out.println(swap_string_index_stream("hello", 1, 2));
        System.out.println(swap_string_index_stream("I love you", 3, 6));
    }

    private static String swap_string_index(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1,my_string.charAt(num2));
        sb.setCharAt(num2,my_string.charAt(num1));
        return sb.toString();

    }

    private static String swap_string_index_stream(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2); // List 안에 있는 데이터 순서를 변경하고 싶은 경우 Collections swap 사용
        return String.join("", list); // Java 8 추가된 기능 -> join("추가할 문자", "대상 list")

    }
}