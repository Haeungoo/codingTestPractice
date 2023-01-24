package org.example.programmers.Lv0;


public class Lv0_cursed_number_3 {

    public static void main(String[] args) {
        System.out.println(cursed_number_3(15));
        System.out.println(cursed_number_3(40));
    }

    private static int cursed_number_3(int n) {
        int answer = 0;
        for(int i = 0; i < n; i++){
            answer++;
            while(answer%3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }

        }
        return answer;
    }

}