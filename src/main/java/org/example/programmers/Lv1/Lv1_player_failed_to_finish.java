package org.example.programmers.Lv1;

import java.util.HashMap;

public class Lv1_player_failed_to_finish {


    public static void main(String[] args) {
        System.out.println(function(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(function(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(function(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
    private static String function(String[] participant, String[] completion){
       String answer = "";
       HashMap<String, Integer> hm = new HashMap<>();
       for(String player: participant) hm.put(player, hm.getOrDefault(player,0)+1);
       for(String player: completion) hm.put(player, hm.get(player)-1);
       for(String key: hm.keySet()){
           if(hm.get(key) != 0){
               answer = key;
           }
       }
       return answer;
    }
}
