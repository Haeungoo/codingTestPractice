package org.example.programmers.Lv1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lv1_list_of_cellphone {


    public static void main(String[] args) {
        System.out.println(function(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(function(new String[]{"123","456","789"}));
        System.out.println(function(new String[]{"12","123","1235","567","88"}));
        System.out.println("=======================================================");
        System.out.println(treeSet_function(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(treeSet_function(new String[]{"123","456","789"}));
        System.out.println(treeSet_function(new String[]{"12","123","1235","567","88"}));
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


    /**
     * [TreeSet]클래스는 [Set] 인터페이스를 구현한 클래스
     * => Set 인터페이스를 구현, 데이터에 대한 중복 저장하지 않고, 저장된 순서를 유지하지 않는다.
     * [HashSet]과 다르게 [TreeSet]은 데이터 저장을 위한 RB-Tree(Red/Black Tree) 자료구조를 내부에 가지고 있다.
     * RB Tree : 부모노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 노드는 오른쪽 자식으로 배치하여 데이터의 추가나 삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞춘다.
     */

    private static boolean treeSet_function(String[] phone_book){
        Set<String> ts = new TreeSet<>(Arrays.asList(phone_book));
        Iterator<String> iterator = ts.iterator();
        String prev = "previous";
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith(prev)) return false;
            else prev = next;
        }
        return true;
    }
}
