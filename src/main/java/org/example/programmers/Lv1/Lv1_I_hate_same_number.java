package org.example.programmers.Lv1;

import java.util.*;

public class Lv1_I_hate_same_number {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(function_stack(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(function_stack(new int[]{4, 4, 4, 3, 3})));
        System.out.println("============================================================");
        System.out.println(Arrays.toString(function_list(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(function_list(new int[]{4, 4, 4, 3, 3})));
    }
    private static int[] function_stack(int[] arr){
        Stack<Integer> stack = new Stack<>();

        for (int j : arr) {
            if (!stack.isEmpty()) {
                if (stack.peek() != j) {
                    stack.push(j);
                }
            } else {
                stack.push(j);
            }
        }
        int [] answer = new int[stack.size()];
        for(int i=stack.size()-1; i >= 0; i--){
            answer[i] = stack.pop();
        }
        //스택은 pop하면 선입후출이므로 역순서로 배열에 넣는다.
        return answer;
    }

    private static int[] function_list(int[] arr){
        int[] answer = {};
        List<Integer> aList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(i>0){
                if(arr[i-1] != arr[i]){
                    aList.add(arr[i]);
                }
            }else{
                aList.add(arr[i]);
            }
        }
        answer = new int[aList.size()];

        for(int i = 0; i<aList.size();i++){
            answer[i] = aList.get(i);
        }


        return answer;
    }
}
