package BaekJoon.알고리즘_기초1.수학1_연습.숨바꼭질6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 17087번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(Integer.parseInt(st.nextToken()) - s);
        }

        print(n, arr);
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    private static void print(int n, int[] arr) {
        if (n == 1) System.out.println(arr[0]);
        else {
            int gcd = gcd(arr[0], arr[1]);

            for (int i = 2; i < n; i++) {
                gcd = gcd(gcd, arr[i]);
            }

            System.out.println(gcd);
        }
    }
}
