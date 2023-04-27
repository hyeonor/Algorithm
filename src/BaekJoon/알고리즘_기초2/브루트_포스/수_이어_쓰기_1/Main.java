package BaekJoon.알고리즘_기초2.브루트_포스.수_이어_쓰기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int length = s.length();
        int N = Integer.parseInt(s);

        System.out.println(getAns(length, N));
    }

    private static int getAns(int length, int N) {
        int[] arr = {9, 90, 900, 9000, 90000, 900000, 9000000, 90000000};
        int x = 10, sum = 0;

        for (int i = 0; i < length - 1; i++) {
            sum += (i + 1) * arr[i];
        }

        sum += (N - Math.pow(x, length - 1) + 1) * length;

        return sum;
    }
}
