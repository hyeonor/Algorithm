package BaekJoon.알고리즘_기초2.브루트_포스_N과_M.N과_M_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {// 15666번
    static int N, M;
    static int[] ans;
    static int[] arr;
    static StringBuffer sb = new StringBuffer();
    static HashSet<String> set = new HashSet<>();
    static StringBuffer getans = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ans = new int[M];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0);

        System.out.println(getans);
    }

    static void dfs(int idx, int depth) {
        if (depth == M) {
            for (int a : ans) {
                sb.append(a).append(' ');
            }
            if (!set.contains(sb.toString())) {
                set.add(sb.toString());
                getans.append(sb).append('\n');
            }
            sb = new StringBuffer();
            return;
        }

        for (int i = idx; i < N; i++) {
            ans[depth] = arr[i];
            dfs(i, depth + 1);
        }
    }
}
