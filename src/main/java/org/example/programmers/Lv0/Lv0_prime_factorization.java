package org.example.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Lv0_prime_factorization {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prime_factorization(12)));
        System.out.println(Arrays.toString(prime_factorization(17)));
        System.out.println(Arrays.toString(prime_factorization(420)));
        System.out.println("=========================================");
        System.out.println(Arrays.toString(prime_factorization_2(12)));
        System.out.println(Arrays.toString(prime_factorization_2(17)));
        System.out.println(Arrays.toString(prime_factorization_2(420)));
    }

    private static int[] prime_factorization(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 2; i <= n ; i++){
            while(n%i == 0){
                if(!answer.contains(i)){
                    answer.add(i);
                }
                n/=i;
            }
        }
        return answer.stream().sorted().mapToInt(i->i).toArray();
    }

    private static int[] prime_factorization_2(int n) {
        Set<Integer> answer = new HashSet<>();
        for(int i = 2; i <= n ; i++){
            while(n%i == 0){
                answer.add(i); // Set 자료구조로 중복을 허용하지 않는다.
                n/=i;
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }


}