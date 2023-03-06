package BaekJoon.알고리즘_기초1.수학1.조합_0의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 2004번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int two = twoCount(n) - twoCount(n - m) - twoCount(m);
        int five = fiveCount(n) - fiveCount(n - m) - fiveCount(m);

        System.out.println(Math.min(two, five));
    }

    private static int twoCount(int n) {
        int cnt2 = 0;

        while (n >= 2) {
            cnt2 += n / 2;
            n /= 2;
        }

        return cnt2;
    }

    private static int fiveCount(int n) {
        int cnt5 = 0;

        while (n >= 5) {
            cnt5 += n / 5;
            n /= 5;
        }

        return cnt5;
    }
}
