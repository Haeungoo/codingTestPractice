package org.example.programmers.Lv0;

import java.util.*;

public class Lv0_ranking {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(set_ranking(new int[][]{{80,70},{90,50},{40,70},{50,80}})));
        System.out.println(Arrays.toString(set_ranking(new int[][]{{80,70},{70, 80},{30, 50},{90, 100},{100,90},{100,100},{10,30}})));
    }

    private static int[] set_ranking(int[][] score) {
        int [] answer = new int[score.length];
        List<Score> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            int[] scoreList = score[i];
            list.add(new Score(scoreList[0],scoreList[1], i));
        }
        list.sort(null);

        double temp = list.get(0).getAvg();
        int rank = 1;
        int count = 1;

        for(Score s: list){
            if(temp > s.getAvg()){
                temp = s.getAvg();
                rank = count;
            }
            int index = s.getIndex();
            answer[index] = rank;

            count++;
        }
        return answer;
    }


    private static class Score implements Comparable<Score>{
        private final int eng, math, index;
        private final double avg;

        public Score(int eng, int math, int index){
            this.eng = eng;
            this.math = math;
            this.index = index;
            this.avg = (eng+math) / 2.0;
        }

        public int getIndex(){
            return index;
        }

        public double getAvg(){
            return avg;
        }

        @Override
        public int compareTo(Score o1){
            double avg1 = this.getAvg();
            double avg2 = o1.getAvg();

            if(avg1 > avg2) return -1;
            else if(avg1 < avg2) return 1;

            return 0;
        }
    }

}