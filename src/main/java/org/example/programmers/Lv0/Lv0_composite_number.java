package org.example.programmers.Lv0;

import java.util.stream.IntStream;

public class Lv0_composite_number {

    public static void main(String[] args) {
        System.out.println(composite_number(10));
        System.out.println(composite_number(15));
        System.out.println("======================================");
        System.out.println(composite_number_2(10));
        System.out.println(composite_number_2(15));
        System.out.println("======================================");
        System.out.println(composite_number_with_stream(10));
        System.out.println(composite_number_with_stream(15));

    }

    private static int composite_number(int n) {
        int answer = 0;
        int[] countArr = new int[n];
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                if(i%j==0){
                    countArr[i-1]++;
                }
            }
        }

        for(int count: countArr){
            if(count >= 3) answer++;
        }

        return answer;
    }

    private static int composite_number_2(int n) {
        int answer = 0;

        for(int i = 1; i <= n ; i++){
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                if(i%j==0) cnt++;
            }
            if(cnt >= 3) answer++;
        }

        return answer;
    }

    // rangeClosed() 종료값(n)을 포함해서 반환한다.
    // filter(Predicate), filter(IntPredicate) 등 조건 필터링 => 주어진 Predicate가 true를 리턴하는 요소만 필터링
    private static int composite_number_with_stream(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}