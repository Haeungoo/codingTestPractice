package org.example.programmers.Lv0;


import java.util.Arrays;
import java.util.HashMap;

public class Lv0_a_to_b {

    public static void main(String[] args) {
        System.out.println(a_to_b_fail("olleh", "hello"));
        System.out.println(a_to_b_fail("allpe", "apple"));
        System.out.println("=============================================");
        System.out.println(a_to_b_success("olleh", "hello"));
        System.out.println(a_to_b_success("allpe", "apple"));
    }

    private static int a_to_b_fail(String before, String after) { //런타임 아웃(Failed)
        boolean dupCheck = false;
        HashMap<String, Integer> hm = new HashMap<>();
        for(String b: before.split("")){
            hm.put(b, hm.getOrDefault(b, 0)+1); // 중복되면 +1, 중복된 것이 없으면 0 -> +1해서 1
        }
        for(String a: after.split("")){
            if(hm.get(a) > 0)
                hm.put(a, hm.get(a)-1);
        }
        for (String key : hm.keySet()) {
            dupCheck = hm.get(key) == 0;
        }
        return dupCheck ? 1: 0;
    }

    private static int a_to_b_success(String before, String after) {
        char[] beforeC = before.toCharArray();
        char[] afterC = after.toCharArray();

        Arrays.sort(beforeC);
        Arrays.sort(afterC);

        String beS = new String(beforeC);
        String afS = new String(afterC);

        return beS.equals(afS) ? 1: 0;
    }
}