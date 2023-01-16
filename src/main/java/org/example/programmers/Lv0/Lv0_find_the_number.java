package org.example.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lv0_find_the_number {

    public static void main(String[] args) {
        System.out.println(find_the_number(29183, 1));
        System.out.println(find_the_number(232443, 4));
        System.out.println(find_the_number(123456, 7));
        System.out.println("=======================================");
        System.out.println(find_the_number_2(29183, 1));
        System.out.println(find_the_number_2(232443, 4));
        System.out.println(find_the_number_2(123456, 7));
    }

    private static int find_the_number(int num, int k) {
        String strNum = num + "";
        String strK = k + "";
        int answer = strNum.indexOf(strK);
        return answer > -1 ? ++answer : answer;
    }

    private static int find_the_number_2(int num, int k) {
        int answer = 0;
        int index = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        while (num != 0) {
            numList.add(num % 10);
            num /= 10;
        }
        for (int i = numList.size() - 1; i >= 0; i--) {
            index++;
            if (k == numList.get(i)) {
                answer = index;
                break;
            } else answer = -1;
        }
        return answer;
    }


}