package org.example.programmers.Lv3;

import java.util.*;

public class Lv3_best_album_v3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(function(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
    }

    public static int[] function(String[] genres, int[] plays) {
        Map<String, Integer> sum = new HashMap<>();
        List<Genre> sum_rank = new ArrayList<>();
        Map<String, List<Music>> best = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < genres.length; i++){
            sum.put(genres[i],sum.getOrDefault(genres[i],0)+plays[i]);

            List<Music> list = best.getOrDefault(genres[i], new ArrayList<>());
            list.add(new Music(i, genres[i], plays[i]));
            best.put(genres[i], list);
        }

        for(String s: sum.keySet()){
            sum_rank.add(new Genre(s, sum.get(s)));
        }

        Collections.sort(sum_rank);

//        pop : 3100
//        classic : 1450

//        for(Genre g: sum_rank){
//            System.out.println(g.value + " : " + g.plays);
//        }

        for (Genre value : sum_rank) {
            int count = 0;
            List<Music> list = best.get(value.value);
            Collections.sort(list);
            for (Music music : list) {
                if (count == 2) {
                    break;
                }
                result.add(music.id);
                count++;
            }
        }
//        [4, 1, 3, 0]
//        System.out.println(result);

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }

    private static class Music implements Comparable<Music>{
        int id;
        String genres;
        int plays;

        Music(int id, String genres, int plays){
            this.id = id;
            this.genres = genres;
            this.plays = plays;
        }

        @Override
        public int compareTo(Music o){
            if(this.plays - o.plays < 0){
                return 1;
            }else if(this.plays - o.plays == 0){
                return this.id - o.id;
            }else{
                return -1;
            }
        }
    }

    private static class Genre implements Comparable<Genre>{
        String value;
        int plays;
        Genre(String value, int plays){
            this.value = value;
            this.plays = plays;
        }

        @Override
        public int compareTo(Genre o){
            return o.plays - this.plays;
        }
    }

}
