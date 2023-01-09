package org.example.programmers.Lv0;

public class Lv0_square_number {

    // Double wrapper class에 있는 intValue()로 정수형 숫자로 바꾼다.
    // 바꾸기 전 숫자와 바꾼 후 숫자가 같으면 정수
    public static void main(String[] args) {
        System.out.println(square_number(144));
        System.out.println(square_number(976));
        System.out.println("==========================");
        System.out.println(square_number_2(144));
        System.out.println(square_number_2(976));
    }

    private static int square_number(int n) {
        Double sqrt = Math.sqrt(n);
        return sqrt == sqrt.intValue() ? 1 : 2;
    }

    private static int square_number_2(int n) {
        double sqrt = Math.sqrt(n);
        return sqrt == (int) sqrt ? 1 : 2;
    }


}