package org.example.programmers;

import java.math.BigInteger; // int의 범위를 넘는 수가 나오기 때문에 BigInteger 사용(divide, multiply 함수 사용 가능)

public class Lv0_factorial_balls_share {

    public static void main(String[] args) {
        System.out.println(divide_balls_share(3,2));
        System.out.println(divide_balls_share(5,3));
    }

    private static BigInteger divide_balls_share(int balls, int share) {
        return fac(balls).divide(((fac(balls-share))).multiply(fac(share)));
    }

    private static BigInteger fac(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for(int i = 1; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(Integer.toString(i)));
        }
        return bigInteger;
    }


}