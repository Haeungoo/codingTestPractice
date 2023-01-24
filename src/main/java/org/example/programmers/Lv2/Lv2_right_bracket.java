package org.example.programmers.Lv2;

import java.util.*;

public class Lv2_right_bracket {


    public static void main(String[] args) {
        System.out.println(function_stack("()()"));
        System.out.println(function_stack("(())()"));
        System.out.println(function_stack(")()("));
        System.out.println(function_stack("(()("));
        System.out.println("============================================================");
        System.out.println(function("()()"));
        System.out.println(function("(())()"));
        System.out.println(function(")()("));
        System.out.println(function("(()("));
    }
    private static boolean function_stack(String s){
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{ // ')'가 들어갈 상황에서 스택에 '('가 있으면 -> pop
                    stack.pop();
                }
            }
        }
        answer = stack.isEmpty();
        return answer;
    }

    private static boolean function(String s){
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }


}
