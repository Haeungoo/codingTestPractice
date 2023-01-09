package org.example.programmers.Lv0;

import java.util.stream.IntStream;

public class Lv0_sum_of_even {

    public static void main(String[] args) {
        System.out.println(sumOfEven(10));
        System.out.println(sumOfEven(4));
    }

    private static int sumOfEven(int n) {
        return IntStream.rangeClosed(0,n)
                .filter(e -> e%2 == 0)
                .sum();
    }

}