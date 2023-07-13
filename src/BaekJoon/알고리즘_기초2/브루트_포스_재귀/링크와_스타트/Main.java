package BaekJoon.알고리즘_기초2.브루트_포스_재귀.링크와_스타트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 15661번
    static int N, min = Integer.MAX_VALUE;
    static int[][] node;
    static int[] arr;
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

        int half = N / 2;
        for (int i = 1; i <= half; i++) {
            arr = new int[i];
            dfs(0, 0, i);
        }

        System.out.println(min);
    }

    private static void dfs(int idx, int depth, int half) {
        if (depth == half) {
            int start = 0, link = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    if (visit[i] && visit[j]) start += node[i][j] + node[j][i];
                    if (!visit[i] && !visit[j]) link += node[i][j] + node[j][i];
                }
            }

            int temp = Math.abs(start - link);
            if (min > temp) min = temp;
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                dfs(i + 1, depth + 1, half);
                visit[i] = false;
            }
        }
    }
}

