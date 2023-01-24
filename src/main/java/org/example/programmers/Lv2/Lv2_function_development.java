package org.example.programmers.Lv2;

import java.util.*;

public class Lv2_function_development {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(function_queue(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(function_queue(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println("============================================================");
        System.out.println(Arrays.toString(function(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(function(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
    private static int[] function_queue(int[] progresses, int[] speeds){
        Queue<Integer> q = new LinkedList<>(); // Queue는 인터페이스만 있고 별도의 클래스가 없다.
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < speeds.length; i++){
            double leftOver = (100-progresses[i])/ (double) speeds[i];
            int date = (int) Math.ceil(leftOver);

            if(!q.isEmpty() && q.peek() < date){
                answerList.add(q.size());
                q.clear();
            }
            q.offer(date);
        }
        answerList.add(q.size());
        int [] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private static int[] function(int[] progresses, int[] speeds){
        List<Integer> list = new ArrayList<>();
        int[] day = new int[speeds.length];

        for(int i = 0; i< speeds.length; i++){
            day[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                day[i] += 1;
            }
        }
        int prev = day[0];
        int cnt = 1;
        for(int i = 1; i < day.length; i++){
            if(prev < day[i]){
                list.add(cnt);
                cnt = 1;
                prev = day[i];
            }else{
                cnt ++;
            }
        }
        list.add(cnt);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }


}
