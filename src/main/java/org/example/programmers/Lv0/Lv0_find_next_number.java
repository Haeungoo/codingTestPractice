package org.example.programmers.Lv0;


public class Lv0_find_next_number {

    public static void main(String[] args) {
        System.out.println(find_next_number(new int[]{1,2,3,4}));
        System.out.println(find_next_number(new int[]{2,4,8}));
        System.out.println("=======================================");
        System.out.println(find_next_number_2(new int[]{1,2,3,4}));
        System.out.println(find_next_number_2(new int[]{2,4,8}));
    }

    private static int find_next_number(int[] common) {
        int answer = 0;
        if((common[1]-common[0]) == (common[2]-common[1])){
            answer = common[common.length-1] + (common[1]-common[0]);
        }else{
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        return answer;
    }

    private static int find_next_number_2(int[] common){
        return (common[1]-common[0]) == (common[2]-common[1]) ? common[common.length-1] + (common[1]-common[0]) : common[common.length-1] * (common[1]/common[0]);
    }
}