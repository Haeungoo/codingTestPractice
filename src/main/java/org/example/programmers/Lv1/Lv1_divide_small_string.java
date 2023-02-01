package org.example.programmers.Lv1;

import java.util.stream.LongStream;

/**
 * 코딩테스트 연습 > 연습문제 > 크기가 작은 부분 문자열
 */

public class Lv1_divide_small_string {

    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
        System.out.println("=======================================");
        System.out.println(solution_stream("3141592", "271"));
        System.out.println(solution_stream("500220839878", "7"));
        System.out.println(solution_stream("10203", "15"));

    }

    private static int solution(String t, String p) {
        int length = p.length();
        long num = Long.parseLong(p);
        int result = 0;

        for(int i = 0 ; i < t.length() - length + 1; i++){
            long diff = Long.parseLong(t.substring(i, i + length));
            if(diff <= num) result ++;
        }
        return result;
    }

    private static int solution_stream(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    }


}