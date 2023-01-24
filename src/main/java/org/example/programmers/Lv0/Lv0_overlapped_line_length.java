package org.example.programmers.Lv0;


public class Lv0_overlapped_line_length {

    public static void main(String[] args) {
        System.out.println(overlapped_line_length(new int[][]{{0,1},{2,5},{3,9}}));
        System.out.println(overlapped_line_length(new int[][]{{-1,1},{1,3},{3,9}}));
        System.out.println(overlapped_line_length(new int[][]{{0,5},{3,9},{1,10}}));
    }

    private static int overlapped_line_length(int[][] lines) {
        int answer = 0;
        
        int[] line0 = countLines(countDots(lines[0][0], lines[0][1]));
        int[] line1 = countLines(countDots(lines[1][0], lines[1][1]));
        int[] line2 = countLines(countDots(lines[2][0], lines[2][1]));

        for(int i = 0; i<line0.length; i++){
            if(line0[i]+line1[i]+line2[i]>1){
                answer++;
            }
        }
        return answer;
    }

    private static int[] countDots(int start, int end){
        int[] cntDots = new int[201]; // -100 ≤ a < b ≤ 100
        for(int i = start+100; i <=end+100; i++){
            cntDots[i]++;
        }
        return cntDots;
    }

    private static int[] countLines(int[] cntDots){
        int[] cntLines = new int[200];
        for(int i = 1; i < cntDots.length; i++){
            if(cntDots[i-1] == 1 && cntDots[i] == 1){
                cntLines[i-1]++;
            }
        }
        return cntLines;
    }
}