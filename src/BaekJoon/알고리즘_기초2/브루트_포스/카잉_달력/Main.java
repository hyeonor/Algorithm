package BaekJoon.알고리즘_기초2.브루트_포스.카잉_달력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 6064번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int M, N, x, y;


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            int j;
            int lcm = M * N / gcd(M, N);
            for (j = x; j <= lcm; j += M) {
                int temp = (j % N == 0) ? N : (j % N);
                if (temp == y) {
                    sb.append(j).append('\n');
                    break;
                }
            }
            if (j > lcm) sb.append("-1\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
