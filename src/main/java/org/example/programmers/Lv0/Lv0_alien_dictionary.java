package org.example.programmers.Lv0;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Lv0_alien_dictionary {

    public static void main(String[] args) {
        System.out.println(alien_dictionary(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(alien_dictionary(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(alien_dictionary(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
        System.out.println("===========================================================================================================");
        System.out.println(alien_dictionary_2(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(alien_dictionary_2(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(alien_dictionary_2(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
        System.out.println("===========================================================================================================");
        System.out.println(alien_dictionary_stream(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(alien_dictionary_stream(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(alien_dictionary_stream(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    private static int alien_dictionary(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        for (String d : dic) {
            if (d.length() == spell.length) {
                for (String s : spell) {
                    if (d.contains(s)) count++;
                    else {
                        count = 0;
                        break;
                    }
                }
                if (count == spell.length) {
                    answer = 1;
                    break;
                }
            }
        }
        if(answer != 1){
            answer = 2;
        }
        return answer;
    }

    private static int alien_dictionary_2(String[] spell, String[] dic) {
        int answer = 2;
        for(String dicS : dic) {
            boolean isRight = true;
            for(String spellS : spell) {
                if(!dicS.contains(spellS)) {
                    isRight = false;
                    break;
                }
            }
            if(isRight) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    private static int alien_dictionary_stream(String[] spell, String[] dic) {
        return Arrays.stream(dic).map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining())).collect(Collectors.toList()).contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;
    }

}