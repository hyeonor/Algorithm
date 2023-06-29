package BaekJoon.알고리즘_기초2.브루트_포스_재귀.스타트와_링크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 14889번
    static int N, min = Integer.MAX_VALUE;
    static int[][] node;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        node = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                node[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(min);
    }

    private static void dfs(int idx, int depth) {
        if (depth == N / 2) {
            int start = 0, link = 0;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (visit[i] && visit[j]) start += (node[i][j] + node[j][i]);
                    if (!visit[i] && !visit[j]) link += (node[i][j] + node[j][i]);
                }
            }

            int temp = Math.abs(start - link);
            if (min > temp) min = temp;
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }
}
