package org.example.programmers.Lv3;

import java.util.*;

public class Lv3_best_album {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(function(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
    }
    private static int[] function(String[] genres, int[] plays){
        // 1. 고유번호와 장르, 고유번호와 플레이수
        HashMap<Integer, Integer> pMap = new HashMap<>();
        HashMap<Integer, String> gMap = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            pMap.put(i, plays[i]);
            gMap.put(i, genres[i]);
        }
        // 2. HashSet으로 장르 분류 (Set은 중복허용 안됨)
        HashSet<String> gSet = new HashSet<>(Arrays.asList(genres));
        // 3. 장르별 총 플레이 회수
        HashMap<Integer, String> coPlay = new HashMap<>();
        for(String genre : gSet){
            int cnt = 0;
            for(int i = 0; i < gMap.size(); i++){
                if(gMap.get(i).equals(genre)){
                    cnt += pMap.get(i);
                }
            }
            coPlay.put(cnt, genre);
        }
        // 4. 플레이수 별로 정렬 (키(장르) 값을 기준으로 정렬, TreeMap)
        TreeMap sort = new TreeMap(coPlay);
        String[] sortGenre = new String[gSet.size()];
        int index = 0;
        for(Object o : sort.keySet()){
            sortGenre[index] = sort.get(o).toString();
            index++;
        }
        // 5. 장르별 많이 플레이 된 노래의 고유번호 찾기
        ArrayList<Integer> fIndex = new ArrayList<>();
        for(int i = sortGenre.length-1; i >= 0; i--){
            int cnt = 0;
            for(int p1 : gMap.keySet()){
                if(sortGenre[i].equals(gMap.get(p1))){
                    cnt++;
                }
            }
            int[] tmp = new int[cnt];
            int k = 0;
            for(int p2 : gMap.keySet()){
                if(sortGenre[i].equals(gMap.get(p2))){
                    tmp[k] = pMap.get(p2);
                    k++;
                }
            }
            if(tmp.length != 1){
                Arrays.sort(tmp);
                for(int j = tmp.length-1; j >= tmp.length-2; j--){
                    for(int p : pMap.keySet()){
                        if(tmp[j] == pMap.get(p)){
                            fIndex.add(p);
                            pMap.put(p,0);
                            break;
                        }
                    }
                }
            }else{
                for(int p : pMap.keySet()){
                    if(tmp[0] == pMap.get(p)){
                        fIndex.add(p);
                        pMap.put(p, 0);
                        break;
                    }
                }
            }
        }
        int[] answer = new int[fIndex.size()];
        for(int m = 0; m< fIndex.size(); m++){
            answer[m] = fIndex.get(m);
        }
        return answer;
    }


}
