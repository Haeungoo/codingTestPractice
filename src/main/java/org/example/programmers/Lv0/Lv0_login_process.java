package org.example.programmers.Lv0;


public class Lv0_login_process {

    public static void main(String[] args) {
        System.out.println(login_process(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}}));
        System.out.println(login_process(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"},{"programmer00", "134"},{"programmer01", "1145"}}));
        System.out.println(login_process(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"},{"krong0313", "29440"},{"rabbit00", "111333"}}));
    }

    private static String login_process(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0]) && id_pw[1].equals(strings[1])) answer = "login";
            else if (id_pw[0].equals(strings[0])) answer = "wrong pw";
        }
        if(answer.equals("")) answer = "fail";

        return answer;
    }
}