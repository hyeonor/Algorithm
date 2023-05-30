package BaekJoon.알고리즘_기초2.브루트_포스_순열.로또;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 6603번
    static int K;
    static int[] arr;
    static int[] result;
    static boolean[] visit;
    static StringBuffer sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());

            if (K == 0) break;

            arr = new int[K];
            result = new int[6];
            visit = new boolean[K];

            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            sb = new StringBuffer();
            dfs(0, 0);
            System.out.print(sb);
            System.out.println();
        }
    }

    static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int r : result) {
                sb.append(r).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < K; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = arr[i];
                dfs(i, depth + 1);
                visit[i] = false;
            }
        }
    }
}
