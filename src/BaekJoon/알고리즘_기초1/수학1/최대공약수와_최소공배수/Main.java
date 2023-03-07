package BaekJoon.알고리즘_기초1.수학1.최대공약수와_최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 2609번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        solution(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static void solution(int n, int m) {
        int gcd = gcd(n, m);
        int[] answer = new int[2];

        answer[0] = gcd;
        answer[1] = n * m / gcd;

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
