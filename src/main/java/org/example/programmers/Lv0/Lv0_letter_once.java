package org.example.programmers.Lv0;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class Lv0_letter_once {

    public static void main(String[] args) {
        System.out.println(letter_once("abcabcadc"));
        System.out.println(letter_once("abdc"));
        System.out.println(letter_once("hello"));
        System.out.println("=========================================");
        System.out.println(letter_once_stream("abcabcadc"));
        System.out.println(letter_once_stream("abdc"));
        System.out.println(letter_once_stream("hello"));
    }

    private static String letter_once_stream(String my_string) {
        return Arrays.stream(my_string.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }

    private static String letter_once(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        int count = 0;

        Arrays.sort(str);

        for(int i = 0; i < str.length; i++){
            count = 0;
            for(int j = 0; j < str.length; j++){
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            if(count == 1){
                answer += str[i];
            }
        }
        return answer;
    }
}