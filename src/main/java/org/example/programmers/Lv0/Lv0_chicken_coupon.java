package org.example.programmers.Lv0;

public class Lv0_chicken_coupon {

    public static void main(String[] args) {
        System.out.println(chicken_coupon(100));
        System.out.println(chicken_coupon(1081));
    }

    // 이진수 더하기
    private static int chicken_coupon(int chicken) {
        int answer = 0;
        while(chicken >= 10){
            int newChicken = chicken/10;
            int restChicken = chicken%10;
            chicken = newChicken + restChicken;

            answer += newChicken;

        }
        return answer;
    }


}