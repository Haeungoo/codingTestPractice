package org.example.baekjoon;

import java.util.Scanner;

public class number_18108 {
    private static final int BUDDHA_ERA = 544;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year-BUDDHA_ERA)+1);

    }
}
