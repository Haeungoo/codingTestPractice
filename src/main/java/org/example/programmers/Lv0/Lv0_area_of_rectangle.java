package org.example.programmers.Lv0;

import java.util.stream.IntStream;

public class Lv0_area_of_rectangle {

    public static void main(String[] args) {
        System.out.println(area_of_rectangle(new int[][]{{1,1},{2,1},{2,2},{1,2}}));
        System.out.println(area_of_rectangle(new int[][]{{-1,-1},{1,1},{1,-1},{-1,1}}));
        System.out.println("============================================================");
        System.out.println(area_of_rectangle_2(new int[][]{{1,1},{2,1},{2,2},{1,2}}));
        System.out.println(area_of_rectangle_2(new int[][]{{-1,-1},{1,1},{1,-1},{-1,1}}));
    }

    private static int area_of_rectangle(int[][] dots) {
        return (dots[0][0]-dots[1][0] !=0 ? Math.abs(dots[0][0]-dots[1][0]) : dots[0][0]-dots[2][0] !=0 ? Math.abs(dots[0][0]-dots[2][0]) : Math.abs(dots[0][0]-dots[3][0])) * (dots[0][1] - dots[1][1] !=0 ? Math.abs(dots[0][1] - dots[1][1]) : dots[0][1] - dots[2][1]!=0 ? Math.abs(dots[0][1] - dots[2][1]) : Math.abs(dots[0][1] - dots[3][1]));
    }
    private static int area_of_rectangle_2(int[][] dots) {
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i = 1; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        answer = tmp2 * tmp3;
        return answer;
    }
}