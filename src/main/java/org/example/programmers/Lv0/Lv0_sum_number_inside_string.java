package org.example.programmers.Lv0;

public class Lv0_sum_number_inside_string {

    public static void main(String[] args) {
        System.out.println(sum_of_hidden_number("aAb1B2cC34oOp"));
        System.out.println(sum_of_hidden_number("1a2b3c4d123"));
        System.out.println("=========================================");
        System.out.println(sum_of_hidden_number_stream("aAb1B2cC34oOp"));
        System.out.println(sum_of_hidden_number_stream("1a2b3c4d123"));

    }

    private static int sum_of_hidden_number(String str) {
        int sum = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

    private static int sum_of_hidden_number_stream(String str) {
        return str.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }

}