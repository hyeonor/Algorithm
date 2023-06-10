package BaekJoon.알고리즘_기초2.브루트_포스_재귀.퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 14501번
    static int N, max = Integer.MIN_VALUE;
    static int[] T, P;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        T = new int[N + 2];
        P = new int[N + 2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        add(0, 0);

        System.out.println(max);
    }

    private static void add(int k, int money) {
        if (k > N) return;
        if (k == N) {
            max = Math.max(max, money);
            return;
        }

        add(k + T[k], money + P[k]);
        add(k + 1, money);
    }
}
