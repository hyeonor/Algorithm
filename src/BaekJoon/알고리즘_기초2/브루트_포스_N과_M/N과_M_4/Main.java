package BaekJoon.알고리즘_기초2.브루트_포스_N과_M.N과_M_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 15652번
    static int N, M;
    static int[] arr;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(0, 0);

        System.out.println(sb);
    }

    static void dfs(int idx, int depth) {
        if (depth == M) {
            for (int a : arr) {
                sb.append(a).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = idx; i < N; i++) {
            arr[depth] = i + 1;
            dfs(i, depth + 1);
        }
    }
}
