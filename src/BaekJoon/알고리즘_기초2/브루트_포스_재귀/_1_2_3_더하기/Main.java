package BaekJoon.알고리즘_기초2.브루트_포스_재귀._1_2_3_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 9095번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < T; i++) {
            sb.append(add(Integer.parseInt(br.readLine()))).append('\n');
        }

        System.out.println(sb);
    }

    private static int add(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;
        else if (n <= 0) return 0;
        else return add(n - 1) + add(n - 2) + add(n - 3);
    }
}
