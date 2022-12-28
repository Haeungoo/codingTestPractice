package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numLine = br.readLine();
        String[] numList = numLine.split(" ");

        int a = Integer.parseInt(numList[0]);
        int b = Integer.parseInt(numList[1]);

        double func = (double) a/b;
        System.out.println(func);

        br.close();

    }
}
