package org.example.programmers.Lv0;


public class Lv0_add_polynomial {

    public static void main(String[] args) {
        System.out.println(add_polynomial("3x + 7 + x"));
        System.out.println(add_polynomial("x + x + x"));
    }

    private static String add_polynomial(String polynomial) {
        int coef = 0; // 계수
        int cons = 0; // 상수
        String[] polyArr = polynomial.split(" ");
        for(String p: polyArr){
            if(p.contains("x")) coef += p.equals("x") ? 1: Integer.parseInt(p.substring(0,p.length()-1));
            else if(!p.equals("+")) cons += Integer.parseInt(p);
        }
        String coefStr = coef > 0 ? coef == 1 ? "x" : coef + "x" : "";
        String consStr = cons > 0 ? String.valueOf(cons) : "";
        String answer = "";
        if(coef > 0){
            if(cons > 0) answer += coefStr + " + " + consStr;
            else answer += coefStr;
        }else if(cons > 0) answer += consStr;
        return answer;

    }

}