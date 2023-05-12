package BaekJoon.알고리즘_기초2.브루트_포스_N과_M.N과_M_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {// 15664번
    static int N, M;
    static int[] arr, list;
    static boolean[] visit;
    static HashSet<String> set = new HashSet<>();
    static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        list = new int[M];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0);

        System.out.println(ans);
    }

    static void dfs(int idx, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();

            for (int a : list) {
                sb.append(a).append(' ');
            }

            if (!set.contains(sb.toString())) {
                set.add(sb.toString());
                ans.append(sb).append('\n');
            }
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                list[depth] = arr[i];
                dfs(i, depth + 1);
                visit[i] = false;
            }
        }
    }
}
