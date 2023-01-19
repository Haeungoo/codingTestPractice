package org.example.programmers.Lv2;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Lv2_camouflage {


    public static void main(String[] args) {
        System.out.println(function(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(function(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
        System.out.println("=======================================================");
        System.out.println(function_stream(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(function_stream(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
    private static int function(String[][] clothes){
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for (String[] clothe : clothes) {
            String key = clothe[1];
            if (!clothesMap.containsKey(key)) {
                clothesMap.put(key, 1);
            } else {
                clothesMap.put(key, clothesMap.get(key) + 1);
            }
        }
        Iterator<Integer> it = clothesMap.values().iterator();
        int answer = 1;
        while(it.hasNext()){
            answer *= it.next() +1;
        }
        return answer -1 ; // 아무것도 입지 않는 경우 제외
    }


    private static int function_stream(String[][] clothes){
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .reduce(1L, (x, y) -> x * (y + 1)).intValue() - 1;
    }
}
