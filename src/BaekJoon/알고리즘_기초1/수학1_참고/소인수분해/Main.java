package BaekJoon.알고리즘_기초1.수학1_참고.소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 11653번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(decimalNumber(num));
    }

    private static StringBuilder decimalNumber(int num) {
        StringBuilder sb = new StringBuilder();

        int n = 2;
        while (num != 1) {
            if (num % n == 0) {
                sb.append(n).append('\n');
                num /= n;
            } else n++;
        }

        return sb;
    }
}
