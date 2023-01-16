package org.example.programmers.Lv0;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Lv0_sort_string_2 {

    public static void main(String[] args) {
        System.out.println(sort_string_2("Bcad"));
        System.out.println(sort_string_2("heLLo"));
        System.out.println(sort_string_2("Python"));
        System.out.println("========================================");
        System.out.println(sort_string_2_stream("Bcad"));
        System.out.println(sort_string_2_stream("heLLo"));
        System.out.println(sort_string_2_stream("Python"));

    }

    private static String sort_string_2(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str);
        for (String s : str) {
            answer.append(s);
        }
        return answer.toString();
    }
    private static String sort_string_2_stream(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}