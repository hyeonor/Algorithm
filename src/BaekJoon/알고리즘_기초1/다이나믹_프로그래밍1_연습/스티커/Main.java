package BaekJoon.알고리즘_기초1.다이나믹_프로그래밍1_연습.스티커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 9465번
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringTokenizer st1;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[][] a = new int[2][m + 1];
            st = new StringTokenizer(br.readLine());
            st1 = new StringTokenizer(br.readLine());

            for (int j = 1; j <= m; j++) {
                a[0][j] = Integer.parseInt(st.nextToken());
                a[1][j] = Integer.parseInt(st1.nextToken());
            }

            dp(m, a);

            System.out.println(Math.max(dp[0][m], dp[1][m]));
        }
    }

    private static void dp(int m, int[][] a) {
        dp = new int[2][m + 1];

        dp[0][0] = dp[1][0] = 0;
        dp[0][1] = a[0][1];
        dp[1][1] = a[1][1];

        for (int j = 2; j <= m; j++) {
            dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + a[0][j];
            dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + a[1][j];
        }
    }
}
