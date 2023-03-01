package BaekJoon.브루트포스_알고리즘.영화감독_숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 1436번
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        bruteForce();
    }

    private static void bruteForce() {
        int cnt = 0;
        int title = 665;

        while (n != cnt) {
            title++;
            if (String.valueOf(title).contains("666")) cnt++;
        }

        System.out.println(title);
    }
}
