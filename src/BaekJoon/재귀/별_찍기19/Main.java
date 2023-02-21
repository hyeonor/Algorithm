package BaekJoon.재귀.별_찍기19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { //10994번
    static char[][] star;

    public static void star19(int s, int len) {
        if (len <= s) return;

        for (int i = s; i < len; i++) {
            star[s][i] = '*';
            star[len - 1][i] = '*';
            star[i][s] = '*';
            star[i][len - 1] = '*';
        }

        star19(s + 2, len - 2);
    }

    private static void starPrint(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(star[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        n = 4 * n - 3;
        star = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ' ';
            }
        }

        star19(0, n);
        starPrint(n);
    }
}
