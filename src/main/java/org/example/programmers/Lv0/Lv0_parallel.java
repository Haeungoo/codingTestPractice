package org.example.programmers.Lv0;


import java.util.ArrayList;

public class Lv0_parallel {

    public static void main(String[] args) {
        System.out.println(parallel(new int[][]{{1,4},{9,2},{3,8},{11,6}}));
        System.out.println(parallel(new int[][]{{3,5},{4,1},{2,4},{5,10}}));
    }

    private static int parallel(int[][] dots) {
        int answer = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for(int i = 0; i < dots.length-1; i++){
            if(answer == 1) break;
            else{
                for(int j=i+1; j < dots.length; j++){
                    double tmp = (double)(dots[j][1]-dots[i][1])/(dots[j][0]-dots[i][0]);
                    if(arr.contains(tmp)){
                        answer = 1; break;
                    }else{
                        arr.add(tmp);
                    }
                }
            }

        }

        return answer;
    }

}