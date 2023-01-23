package org.example.programmers.Lv0;


public class Lv0_hidden_number_sum {

    public static void main(String[] args) {
        System.out.println(hidden_number_sum("aAb1B2cC34oOp"));
        System.out.println(hidden_number_sum("1a2b3c4d123Z"));
    }

    private static int hidden_number_sum(String my_string) {
        int sum = 0;
        for (String value : my_string.split("[a-zA-Z]")) {
            sum += !value.isEmpty() ? Integer.parseInt(value) : 0;
        }
        return sum;
    }
}