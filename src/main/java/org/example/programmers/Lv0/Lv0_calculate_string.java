package org.example.programmers.Lv0;

import java.util.stream.IntStream;

public class Lv0_calculate_string {

    public static void main(String[] args) {
        System.out.println(calculate_string("3 + 4"));
    }

    private static int calculate_string(String my_string) {
        int answer = 0;
        boolean mode = true;
        String[] str= my_string.split(" ");
        for(int i = 0; i < str.length; i++){
            if(i == 0){
                answer += Integer.parseInt(str[i]);
            }else{
                if(str[i].equals("+")){
                    mode = true;
                }else if(str[i].equals("-")){
                    mode = false;
                }else{
                    if(mode){
                        answer += Integer.parseInt(str[i]);
                    }else{
                        answer -= Integer.parseInt(str[i]);
                    }
                }
            }
        }
        return answer;

    }

}