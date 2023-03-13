package BaekJoon.알고리즘_기초1.수학1_연습.GCD합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 9613번
    static long sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < t; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            long[] num = new long[n];
            boolean[] visited = new boolean[n];

            for (int j = 0; j < n; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }
            combination(num, visited, 0, n, 2);
            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }

    static void combination(long[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            choose(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void choose(long[] arr, boolean[] visited, int n) {
        int idx = 0;
        long[] choose = new long[2];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                choose[idx++] = arr[i];
            }
        }

        long gcd = gcd(choose[0], choose[1]);
        sum += gcd;
    }

    public static long gcd(long num1, long num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
