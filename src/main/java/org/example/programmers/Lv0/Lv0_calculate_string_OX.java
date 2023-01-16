package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_calculate_string_OX {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate_string_OX(new String[]{"3 - 4 = -3","5 + 6 = 11"})));
        System.out.println(Arrays.toString(calculate_string_OX(new String[]{"19 - 6 = 13","5 + 66 = 71","5 - 15 = 63","3 - 1 = 2"})));
        System.out.println("========================================================================================================");
        System.out.println(Arrays.toString(calculate_string_OX_stream(new String[]{"3 - 4 = -3","5 + 6 = 11"})));
        System.out.println(Arrays.toString(calculate_string_OX_stream(new String[]{"19 - 6 = 13","5 + 66 = 71","5 - 15 = 63","3 - 1 = 2"})));
    }

    private static String[] calculate_string_OX(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] qArr = quiz[i].split(" ");
            if(qArr[1].equals("-")){
                if(Integer.parseInt(qArr[0])-Integer.parseInt(qArr[2]) == Integer.parseInt(qArr[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(qArr[1].equals("+")){
                if(Integer.parseInt(qArr[0])+Integer.parseInt(qArr[2]) == Integer.parseInt(qArr[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }

        return answer;

    }

    private static String[] calculate_string_OX_stream(String[] quiz) {
        return Arrays.stream(quiz)
                .map(s -> {
                    String[] arr = s.trim().split(" ");
                    return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
                })
                .toArray(String[]::new);

    }

}