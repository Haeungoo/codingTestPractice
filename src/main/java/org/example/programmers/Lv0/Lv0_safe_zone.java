package org.example.programmers.Lv0;


public class Lv0_safe_zone {

    public static void main(String[] args) {
        System.out.println(safe_zone(new int[][]{{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}}));
        System.out.println(safe_zone(new int[][]{{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 1, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}}));
        System.out.println(safe_zone(new int[][]{{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1}}));
    }

    private static int safe_zone(int[][] board) {
        int n = board.length;
        int[][] copy = new int[n][n];

        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                if(board[row][col] == 1){
                    destory(col, row, n, copy);
                }
            }
        }
        int cnt = 0;
        for (int[] ints : copy) {
            for (int j = 0; j < copy.length; j++) {
                if (ints[j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void destory(int col, int row, int n, int[][] copy){
        for(int r=row-1; r <=row+1; r++){
            if(r<0||r>=n){
                continue;
            }else{
                for(int c=col-1;c<=col+1; c++){
                    if(c<0 || c>=n){
                        continue;
                    }else{
                        copy[r][c] = 1;
                    }
                }
            }
        }
    }

}