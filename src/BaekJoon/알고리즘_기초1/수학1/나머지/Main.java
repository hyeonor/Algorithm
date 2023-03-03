package BaekJoon.알고리즘_기초1.수학1.나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 10430번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int first = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);
        int third = Integer.parseInt(arr[2]);

        remainder(first, second, third);
    }

    private static void remainder(int first, int second, int third) {
        String s = String.valueOf((first + second) % third) + '\n' +
                ((first % third) + (second % third)) % third + '\n' +
                (first * second) % third + '\n' +
                ((first % third) * (second % third)) % third;

        System.out.println(s);
    }
}
