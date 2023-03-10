package BaekJoon.알고리즘_기초1.수학1.팩토리얼_0의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Objects;

import static java.math.BigInteger.*;

public class Main {// 1676번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        BigInteger n = BigInteger.valueOf(m);

        BigInteger result = factorial(n);

        zeroCount2(m);

        zeroCount(result);
    }

    private static void zeroCount2(int m) {
        int cnt2 = 0;
        int cnt5 = 0;
        for (int i = 2; i <= m; i++) {
            int temp = i;
            while (temp % 2 == 0) {
                temp /= 2;
                cnt2++;
            }
            while (temp % 5 == 0) {
                temp /= 5;
                cnt5++;
            }
        }

        System.out.println(Math.min(cnt2, cnt5));
    }

    public static BigInteger factorial(BigInteger n) {
        if (Objects.equals(n, valueOf(1)) || Objects.equals(n, valueOf(0)))
            return ONE;

        return n.multiply(factorial(n.subtract(valueOf(1))));
    }

    private static void zeroCount(BigInteger result) {
        int cnt = 0;

        while (result.remainder(valueOf(10)).equals(valueOf(0))) {
            result = result.divide(BigInteger.valueOf(10));
            cnt++;
        }

        System.out.println(cnt);
    }
}
