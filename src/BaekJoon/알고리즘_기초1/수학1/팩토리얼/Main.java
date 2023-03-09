package BaekJoon.알고리즘_기초1.수학1.팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 10872번
    static int n;

    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));
    }
}
