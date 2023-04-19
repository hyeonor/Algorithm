package BaekJoon.알고리즘_기초1.다이나믹_프로그래밍1_연습._1_2_3_더하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 15988번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = dynamic();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            sb.append(dp[m]).append('\n');
        }

        System.out.println(sb);
    }

    private static long[] dynamic() {
        long[] dp = new long[1000001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int j = 4; j < 1000001; j++) {
            dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3]) % 1000000009;
        }

        return dp;
    }
}
