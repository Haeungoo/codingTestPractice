package org.example.programmers.Lv0;

import java.util.Arrays;

public class Lv0_weird_array {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(weird_array(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(weird_array(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
        System.out.println("=================================================================");
        System.out.println(Arrays.toString(weird_array_stream(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(weird_array_stream(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }

    private static int[] weird_array(int[] numlist, int n) {
        int[] answer = new int[numlist.length], check = new int[10001];
        Arrays.fill(check, -1);

        for(int i = 0 ; i < numlist.length; i++){
           check[numlist[i]] = Math.abs(numlist[i]-n);
        }
        for(int i = 0; i < answer.length; i++){
            int num = 0, sub = 10000;
            for(int j = 1; j < check.length; j++){
                if(check[j] != -1 && check[j] <= sub){
                    sub = check[j];
                    num = j;
                }
            }
            answer[i] = num;
            check[num] = -1;
        }
        return answer;
    }

    private static int[] weird_array_stream(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a,b) -> Math.abs(a-n) == Math.abs(b-n) ? b.compareTo(a):Integer.compare(Math.abs(a-n), Math.abs(b-n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }

}