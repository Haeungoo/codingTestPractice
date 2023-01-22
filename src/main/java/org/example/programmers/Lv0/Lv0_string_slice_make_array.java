package org.example.programmers.Lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lv0_string_slice_make_array {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(string_slice_make_array("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(string_slice_make_array("abcdef123", 3)));
        System.out.println("===========================================================================");
        System.out.println(Arrays.toString(string_slice_make_array_stream("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(string_slice_make_array_stream("abcdef123", 3)));
    }

    private static String[] string_slice_make_array(String my_str, int n) {
        String [] arr = my_str.length()%n== 0 ? new String[my_str.length()/n] : new String[my_str.length()/n+1];
        for(int i = 0; i < arr.length; i++){
            String s = "";
            if((i+1)*n < my_str.length()){
                s = my_str.substring(i*n,(i+1)*n);
            }else{
                s = my_str.substring(i*n);
            }
            arr[i] = s;
        }
        return arr;
    }

    private static String[] string_slice_make_array_stream(String my_str, int n) {
        return IntStream.range(0, my_str.length() / n + (my_str.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == my_str.length() / n ? my_str.substring(i * n) : my_str.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }
}