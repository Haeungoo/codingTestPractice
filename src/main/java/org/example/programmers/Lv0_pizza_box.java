package org.example.programmers;

public class Lv0_pizza_box {

    public static void main(String[] args) {
        System.out.println(pizza_count_same_portion(6));
        System.out.println(pizza_count_same_portion(10));
        System.out.println(pizza_count_same_portion(4));
    }

    private static int pizza_count_same_portion(int n) {
        int pizza_box = 6;
        while(pizza_box%n != 0){
            pizza_box+=6;
        }
        return pizza_box/6;
    }
}