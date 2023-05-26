package BaekJoon.알고리즘_기초2.브루트_포스_순열.외판원_순회_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, min = Integer.MAX_VALUE;
    static int[][] node;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        node = new int[N + 2][N + 2];
        visit = new boolean[N + 2];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                node[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 1; x < N + 1; x++) {
            visit[x] = true;
            bfs(x, x, 0, 0);
        }

        System.out.println(min);
    }

    static void bfs(int start, int now, int sum, int cnt) {
        if (cnt == N - 1) {
            if (node[now][start] != 0) {
                sum += node[now][start];
                min = Math.min(min, sum);
            }
            return;
        }

        for (int i = 1; i < N + 1; i++) {
            if (!visit[i] && node[now][i] != 0) {
                visit[i] = true;
                bfs(start, i, sum + node[now][i], cnt + 1);
                visit[i] = false;
            }
        }
    }
}
