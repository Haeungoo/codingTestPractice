package org.example;

public class Programmers_Lv0 {
    //private final static: 메모리에 한 번 올라가면 같은 값을 클래스 내부의 전체 필드, 메서드에서 공유한다.
    private final static String[] first_babbling = {"aya", "yee", "u", "maa", "wyeoo"};
    private final static String[] second_babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

    public static void main(String[] args) {
        System.out.println(function(first_babbling) == 1);
        System.out.println(function(second_babbling) == 3);
    }
    private static int function(String[] strArray){
        int count = 0;
        for(int i=0; i < strArray.length; i++){
            strArray[i] = strArray[i].replace("aya","!")
                    .replace("ye","!")
                    .replace("woo","!")
                    .replace("ma","!");
            if(strArray[i].contains("!")) {
                count++;
                strArray[i] = strArray[i].replace("!","");
                if(!strArray[i].equals("") && !strArray[i].contains("!")){
                    count--;
                }
            }
        }
        return count;
    }
}