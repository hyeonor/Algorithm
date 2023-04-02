package BaekJoon.알고리즘_기초1.자료구조1_참고.네_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        long firstSecond = getAdd(arr[0] + arr[1]);
        long thirdFourth = getAdd(arr[2] + arr[3]);

        System.out.println(getAnswer(firstSecond, thirdFourth));
    }

    private static long getAnswer(long firstSecond, long thirdFourth) {
        return firstSecond + thirdFourth;
    }

    private static long getAdd(String arr) {
        return Long.parseLong(arr);
    }
}
