package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_addition_of_fractions {
    static int denum1 = 1;
    static int num1 = 2;
    static int denum2 =3;
    static int num2 = 4;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(function(denum1, num1, denum2, num2)));

    }
    private static int[] function(int denum1, int num1, int denum2, int num2){
        int[] answer = new int[2];
        int max = 1;
        int num = num1 * num2;
        int de = denum1 * num2 + denum2 * num1;
        for(int i = 1 ; i <= num && i <= de; i++){
            if(num%i == 0 && de%i == 0){
                max = i;
            }
        }
        answer[0] = de/max;
        answer[1] = num/max;

        return answer;
    }
}