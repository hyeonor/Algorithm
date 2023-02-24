package BaekJoon.재귀.피보나치_수_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;

        if (n == 2 || n == 1)
            return 1;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n));
    }
}
