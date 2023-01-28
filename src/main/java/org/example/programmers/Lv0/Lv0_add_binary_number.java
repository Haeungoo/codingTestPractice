package org.example.programmers.Lv0;

public class Lv0_add_binary_number {

    public static void main(String[] args) {
        System.out.println(add_binary_number("10","11"));
        System.out.println(add_binary_number("1001","1111"));
    }

    // 이진수 더하기
    private static String add_binary_number(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);
    }


}