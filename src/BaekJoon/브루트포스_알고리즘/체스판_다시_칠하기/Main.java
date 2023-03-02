package BaekJoon.브루트포스_알고리즘.체스판_다시_칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 1018번
    static int n;
    static int m;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int curAns = solved(i, j, arr);

                if (ans > curAns) ans = curAns;
            }
        }

        System.out.println(ans);
    }

    private static int solved(int n, int m, String[] arr) {
        String white = "WBWBWBWBWBWB";
        String black = "BWBWBWBWBWBW";

        int FirstWhite = 0;
        int FirstBlack = 0;

        for (int i = n; i < n + 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (white.charAt(j) != arr[i].charAt(j + m)) FirstWhite++;
                    if (black.charAt(j) != arr[i].charAt(j + m)) FirstBlack++;
                } else {
                    if (black.charAt(j) != arr[i].charAt(j + m)) FirstWhite++;
                    if (white.charAt(j) != arr[i].charAt(j + m)) FirstBlack++;
                }
            }
        }

        return Math.min(FirstWhite, FirstBlack);
    }
}
