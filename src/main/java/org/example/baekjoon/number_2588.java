package org.example.baekjoon;

import java.io.*;

public class number_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int a = n*(m%10);
        m = m/10;
        int b = n*(m%10);
        int c = n*(m/10);

        String str = a + "\n" + b + "\n" + c + "\n" + (a+10*b+100*c);
        System.out.println(str);

    }
}
