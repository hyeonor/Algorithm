package BaekJoon.알고리즘_기초2.브루트_포스.일곱_난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.arraycopy;

public class Main {// 2309번
    static int[] dwarves;
    static int[] factDwarves = new int[7];
    static int[] ans = new int[7];

    private static void combination(int cnt, int start) {
        if (cnt == 7) {
            int total = 0;
            for (int factDwarf : factDwarves) total += factDwarf;
            if (total == 100) {
                arraycopy(factDwarves, 0, ans, 0, factDwarves.length);
            }
            return;
        }

        for (int i = start; i < dwarves.length; i++) {
            factDwarves[cnt] = dwarves[i];
            combination(cnt + 1, i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dwarves = new int[9];

        for (int i = 0; i < 9; i++) {
            dwarves[i] = Integer.parseInt(br.readLine());
        }

        combination(0, 0);

        Arrays.sort(ans);

        StringBuffer sb = new StringBuffer();
        for (int a : ans) sb.append(a).append("\n");

        System.out.println(sb);
    }
}
