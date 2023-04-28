package BaekJoon.알고리즘_기초2.브루트_포스.사탕_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 3085번
    static char[][] board;
    static int n = 0;
    static int max = 0;

    private static int search() {

        //가로
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == board[i][j + 1]) cnt++;
                else cnt = 1;
                max = Math.max(max, cnt);
            }
        }

        //세로
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if (board[j][i] == board[j + 1][i]) cnt++;
                else cnt = 1;
                max = Math.max(max, cnt);
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            board[i] = s.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                char swap = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = swap;
                search();
                // 원상 복구
                swap = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = swap;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                char swap = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = swap;
                max = Math.max(search(), max);
                // 원상 복구
                swap = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = swap;
            }
        }

        System.out.println(max);
    }
}
