package org.example.programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2_printer {


    public static void main(String[] args) {
        System.out.println(function_queue(new int[]{2,1,3,2},2));
        System.out.println(function_queue(new int[]{1,1,9,1,1,1},0));
    }

    private static int function_queue(int[] priorities, int location){
        int answer = 0;
        Queue<Task> queue = new LinkedList<Task>();
        for(int i = 0; i < priorities.length; i++){
            queue.add(new Task(i, priorities[i]));
        }
        int now = 0;
        while(!queue.isEmpty()){
            Task cur = queue.poll();
            boolean flag = false;
            for(Task t: queue){
                if (t.priority > cur.priority) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                queue.add(cur);
            }else{
                now++;
                if(cur.location == location){
                    answer = now;
                    break;
                }
            }
        }
        return answer;
    }

    private static class Task{
        int location;
        int priority;
        public Task(int location, int priority){
            this.location = location;
            this.priority = priority;
        }
    }



}
