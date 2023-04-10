package BaekJoon.알고리즘_기초1.다이나믹_프로그래밍1._1로_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 1463번
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];

//        System.out.println(calculate(n));
        System.out.println(calculate2(n));
    }

    private static int calculate(int n) {

        if (n == 1) return 0;
        if (dp[n] > 0) return dp[n];

        if (n % 6 == 0) {
            dp[n] = Math.min(calculate(n - 1), Math.min(calculate(n / 3), calculate(n / 2))) + 1;
        } else if (n % 3 == 0) {
            dp[n] = Math.min(calculate(n / 3), calculate(n - 1)) + 1;
        } else if (n % 2 == 0) {
            dp[n] = Math.min(calculate(n / 2), calculate(n - 1)) + 1;
        } else {
            dp[n] = calculate(n - 1) + 1;
        }

        return dp[n];
    }

    private static int calculate2(int n) {
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
                dp[i] = dp[i / 2] + 1;
            }
            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
                dp[i] = dp[i / 3] + 1;
            }
        }
        return dp[n];
    }
}
