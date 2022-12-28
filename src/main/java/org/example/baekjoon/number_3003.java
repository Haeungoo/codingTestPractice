package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        [Solution 1] Use StringTokenizer (Memory : 11520KB, Time : 76ms)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

//        [Solution 2] Use Split (Memory : 11524KB, Time : 84ms)
//        String numLine = br.readLine();
//        String[] numList = numLine.split(" ");
//
//        int king = Integer.parseInt(numList[0]);
//        int queen = Integer.parseInt(numList[1]);
//        int rook = Integer.parseInt(numList[2]);
//        int bishop = Integer.parseInt(numList[3]);
//        int knight = Integer.parseInt(numList[4]);
//        int pawn = Integer.parseInt(numList[5]);

        String str = (1-king) + " " + (1-queen) + " " + (2-rook) + " " + (2-bishop) + " " + (2-knight) + " " + (8-pawn);
        System.out.println(str);

    }
}
