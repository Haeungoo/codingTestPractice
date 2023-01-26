package org.example.programmers.Lv2;

import java.util.Arrays;
import java.util.Stack;

public class Lv2_stock_price {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(function_stack(new int[]{1, 2, 3, 2, 3})));
        System.out.println("========================================================");
        System.out.println(Arrays.toString(function(new int[]{1, 2, 3, 2, 3})));
    }

    private static int[] function_stack(int[] prices){
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty()){
                int peek = prices[stack.peek()];
                if(peek > prices[i]){
                    int pop = stack.pop();
                    arr[pop] = i - pop;
                }else{
                    break;
                }
            }
            stack.add(i);
        }
        while(!stack.isEmpty()){
            int pop = stack.pop();
            arr[pop] = prices.length - pop -1;
        }
        answer = arr;
        return answer;
    }

    private static int[] function(int[] prices){
        int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }



}
