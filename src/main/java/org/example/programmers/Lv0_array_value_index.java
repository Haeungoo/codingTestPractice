package org.example.programmers;

import java.util.Arrays;
import java.util.Collections;

public class Lv0_array_value_index {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array_value_index(new int[]{1,8,3})));
    }

    private static int[] array_value_index(int[] array) {
        int[] answer = new int[2];
        int[] reverse_arr = Arrays.stream(array).boxed().sorted(Collections.reverseOrder())
               .mapToInt(Integer::intValue).toArray();
        answer[0] = reverse_arr[0];
        answer[1] = Arrays.binarySearch(array, answer[0]);
        return answer;
    }


}