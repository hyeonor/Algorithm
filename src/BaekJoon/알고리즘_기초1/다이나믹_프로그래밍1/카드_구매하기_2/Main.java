package BaekJoon.알고리즘_기초1.다이나믹_프로그래밍1.카드_구매하기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 16194번
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp(dp);

        System.out.println(dp[n]);
    }

    private static void dp(int[] dp) {
        for (int i = 1; i <= n; i++) {
            dp[i] = arr[i];
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], arr[j] + dp[i - j]);
            }
        }
    }
}
