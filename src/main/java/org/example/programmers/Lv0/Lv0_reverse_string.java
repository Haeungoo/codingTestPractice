package org.example.programmers.Lv0;

public class Lv0_reverse_string {

    public static void main(String[] args) {
        System.out.println(reverse_string("jaron"));
        System.out.println(reverse_string_append("bread"));
    }

    private static String reverse_string(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            answer.append(my_string.charAt((my_string.length()-1)-i));
        }
        return answer.toString();
    }

    private static String reverse_string_append(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }


}