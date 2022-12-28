package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numLine = br.readLine();
        String[] numList = numLine.split(" ");

        int a = Integer.parseInt(numList[0]);
        int b = Integer.parseInt(numList[1]);

        int func1 = a+b;
        int func2 = a-b;
        int func3 = a*b;
        int func4 = a/b;
        int func5 = a%b;

        String str = func1 + "\n" + func2 + "\n" + func3 + "\n" + func4 + "\n" +func5;
        System.out.println(str);

        br.close();

    }
}
