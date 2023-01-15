package org.example.programmers.Lv0;

import java.util.stream.IntStream;

public class Lv0_sum_of_even {

    public static void main(String[] args) {
        System.out.println(sum_of_even(10));
        System.out.println(sum_of_even(4));
    }

    private static int sum_of_even(int n) {
        return IntStream.rangeClosed(0,n)
                .filter(e -> e%2 == 0)
                .sum();
    }

}