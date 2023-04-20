package BaekJoon.알고리즘_기초1.다이나믹_프로그래밍1_연습.RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 1149번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n][3];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            dp[i][0] = Long.parseLong(st.nextToken());
            dp[i][1] = Long.parseLong(st.nextToken());
            dp[i][2] = Long.parseLong(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        System.out.println(Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
    }
}
