package org.example.programmers.Lv1;

import java.util.HashSet;

public class Lv1_phone_cat_mon {


    public static void main(String[] args) {
        System.out.println(function(new int[]{3,1,2,3}));
        System.out.println(function(new int[]{3,3,3,2,2,4}));
        System.out.println(function(new int[]{3,3,3,2,2,2}));
    }
    private static int function(int[] nums){
        int numsMax = nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums){
            hs.add(num);
        }
        return Math.min(numsMax, hs.size());
    }
}
