package org.example.programmers.Lv0;


import java.util.Arrays;

public class Lv0_character_spot {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(character_spot(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(character_spot(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
    }

    private static int[] character_spot(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int col = board[1];
        int row = board[0];

        for (String s : keyinput) {
            if (s.equals("left") && answer[0] - 1 >= -(row / 2)) {
                answer[0] -= 1;
            } else if (s.equals("right") && answer[0] + 1 <= (row / 2)) {
                answer[0] += 1;
            } else if (s.equals("up") && answer[1] + 1 <= (col / 2)) {
                answer[1] += 1;
            } else if (s.equals("down") && answer[1] - 1 >= -(col / 2)) {
                answer[1] -= 1;
            }
        }
        return answer;

    }

}