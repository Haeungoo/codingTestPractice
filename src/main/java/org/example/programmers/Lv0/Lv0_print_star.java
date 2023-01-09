package org.example.programmers.Lv0;

import java.util.Scanner;

public class Lv0_print_star {


    public static void main(String[] args) {
        boolean a = print_star(3).equals(print_star_repeat(3));
        System.out.println(print_star(3));
        System.out.println(print_star_repeat(3));
        System.out.println(a);
    }

    private static String print_star(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j ++){
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String print_star_repeat(int n){
        StringBuilder str = new StringBuilder();
        for(int i=1; i<=n; i++){
            str.append("*".repeat(i));
            str.append("\n");
        }
        return str.toString();
    }
}