package org.example.programmers;

import java.util.*;
import java.util.stream.IntStream;

public class Lv0_divisor {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisor(24)));
        System.out.println(Arrays.toString(divisor(29)));
        System.out.println("=========================================");
        System.out.println(Arrays.toString(divisor_2(24)));
        System.out.println(Arrays.toString(divisor_2(29)));
    }

    private static int[] divisor(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    private static int[] divisor_2(int n) {
        return IntStream.rangeClosed(1, n).filter(i-> n % i == 0).toArray();
    }


}