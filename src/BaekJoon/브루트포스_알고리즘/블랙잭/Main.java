package BaekJoon.브루트포스_알고리즘.블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main { // 2798번
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static List<Integer> list = new ArrayList<>();

    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            sum(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void sum(int[] arr, boolean[] visited, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) sum += arr[i];
        }

        if (sum <= M) list.add(sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        combination(arr, visited, 0, N, 3);
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
    }
}
