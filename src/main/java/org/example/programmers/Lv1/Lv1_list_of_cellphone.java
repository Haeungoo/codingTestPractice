package org.example.programmers.Lv1;

import java.util.Arrays;
import java.util.HashMap;

public class Lv1_list_of_cellphone {


    public static void main(String[] args) {
        System.out.println(function(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(function(new String[]{"123","456","789"}));
        System.out.println(function(new String[]{"12","123","1235","567","88"}));
    }
    private static boolean function(String[] phone_book){
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}
