package org.example.baekjoon;

import java.io.*;

public class number_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numLine = br.readLine();
        String[] numList = numLine.split(" ");

        int a = Integer.parseInt(numList[0]);
        int b = Integer.parseInt(numList[1]);
        int c = Integer.parseInt(numList[2]);

        int func1 = (a+b)%c;
        int func2 = ((a%c)+(b%c))%c;
        int func3 = (a*b)%c;
        int func4 = ((a%c)*(b%c))%c;

        String str = func1 + "\n" + func2 + "\n" + func3 + "\n" + func4;
        System.out.println(str);

        br.close();

    }
}
