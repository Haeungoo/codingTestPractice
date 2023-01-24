package org.example.programmers.Lv0;


import java.util.stream.IntStream;

public class Lv0_triangle_2 {

    public static void main(String[] args) {
        System.out.println(triangle_2(new int[]{1,2}));
        System.out.println(triangle_2(new int[]{3,6}));
        System.out.println(triangle_2(new int[]{11,7}));
        System.out.println("===============================");
        System.out.println(triangle_2_stream(new int[]{1,2}));
        System.out.println(triangle_2_stream(new int[]{3,6}));
        System.out.println(triangle_2_stream(new int[]{11,7}));
    }

    private static int triangle_2_stream(int[] sides) {
        int longer = Math.max(sides[0], sides[1]);
        int shorter = Math.min(sides[0], sides[1]);

        // 될 수 있는 변의 길이는 longer-shorter+1 ~ longer+shorter-1의 범위이다.
        return (int)IntStream.range(longer-shorter+1, longer+shorter).count();
    }
    private static int triangle_2(int[] sides) {
        int bigValue = Math.max(sides[0], sides[1]);
        int smallValue = Math.min(sides[0], sides[1]);

        int minLimit = bigValue - smallValue;
        int maxLimit = bigValue + smallValue;

        return maxLimit - minLimit - 1;
    }

}