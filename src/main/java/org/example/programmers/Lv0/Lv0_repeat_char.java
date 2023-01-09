package org.example.programmers.Lv0;

public class Lv0_repeat_char {

    public static void main(String[] args) {
        System.out.println(repeat_char("hello",3));
    }

    private static String repeat_char(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c: my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}