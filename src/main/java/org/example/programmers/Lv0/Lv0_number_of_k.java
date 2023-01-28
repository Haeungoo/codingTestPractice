package org.example.programmers.Lv0;

public class Lv0_number_of_k {

    public static void main(String[] args) {
        System.out.println(number_of_k(1,13,1));
        System.out.println(number_of_k(10,50,5));
        System.out.println(number_of_k(3,10,2));
    }

    private static int number_of_k(int i, int j, int k) {
        int answer = 0;
        for(int h = i ; h <= j ; h++){
          StringBuilder sb = new StringBuilder();
          sb.append(h);

          for(int m = 0; m < sb.length(); m++){
              if((sb.charAt(m) - '0') == k){ // 문자를 숫자로 변경(sb.charAt(m)인 문자가 숫자가 되려면 -48이 필요 => '0'은 ASCII 코드 48)
                  answer++;
              }
          }
        }
        return answer;
    }


}