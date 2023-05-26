package BaekJoon.알고리즘_기초2.브루트_포스_순열.차이를_최대로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 10819번
    static int N, sum, max = -1;
    static int[] arr;
    static int[] ans;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arr = new int[N];
        ans = new int[N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);

        System.out.println(max);
    }

    static void dfs(int depth) {
        if (depth == N) {
            int n = ans.length - 1;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(ans[i] - ans[i + 1]);
            }
            if (max < sum) max = sum;
            sum = 0;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                ans[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
