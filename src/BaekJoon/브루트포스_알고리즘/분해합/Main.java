package BaekJoon.브루트포스_알고리즘.분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 2798번
    static int decomposition(int m) {
        int sum = 0;

        while (m > 0) {
            sum += m % 10;
            m /= 10;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int sum = decomposition(i) + i;
            if (sum == N) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
