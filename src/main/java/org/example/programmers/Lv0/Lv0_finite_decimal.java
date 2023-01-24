package org.example.programmers.Lv0;


public class Lv0_finite_decimal {

    public static void main(String[] args) {
        System.out.println(finite_decimal(7,20));
        System.out.println(finite_decimal(11,22));
        System.out.println(finite_decimal(12,21));
        System.out.println("=======================================");
    }

    private static int finite_decimal(int a, int b) {
        int refactorB = b / gcd(a,b);
        while(refactorB != 1){
            if(refactorB % 2 == 0){
                refactorB/=2;
            }else if(refactorB % 5 == 0){
                refactorB/=5;
            }else{
                return 2;
            }
        }
        return 1;
    }
    private static int gcd(int a, int b){ // greatest common divisor(최대공약수)
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }

}