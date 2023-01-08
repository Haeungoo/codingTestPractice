package org.example.programmers;


import java.util.Arrays;

public class Lv0_array_dimension {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(change_array_dimension(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(change_array_dimension(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
        System.out.println("========================================================================================");
        System.out.println(Arrays.deepToString(change_array_dimension2(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(change_array_dimension2(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));

    }

    private static int[][] change_array_dimension(int[] num_list, int n) {
        int [][] answer = new int [num_list.length/n][n];
        for(int i = 0; i < num_list.length/n; i ++){
            int[] arr = new int[n]; // 1차원 배열을 만들고 다시 원하는 값(i*n+j)을 넣어줌.
            for(int j = 0; j < n; j++){
                arr[j] = num_list[i*n+j];
            }
            answer[i] = arr;
        }
        return answer;
    }

    private static int[][] change_array_dimension2(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i]; // i/n(몫), i%n(나머지)로 표현하는 방식
        }

        return answer;
    }


}