package org.example.programmers.Lv0;

public class Lv0_pizza_box_2 {

    public static void main(String[] args) {
        System.out.println(pizza_one_portion(7,10));
        System.out.println(pizza_one_portion(4,12));
    }

    private static int pizza_one_portion(int slice, int n) {
        int pizza_slice = slice;
        int pizza_box = 0;
        while(slice/n < 1){
            slice+=pizza_slice;
        }
        pizza_box = slice/pizza_slice;
        pizza_box = slice%n==0? pizza_box: pizza_box++;
        return pizza_box;
    }
}