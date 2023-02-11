package BaekJoon.정렬.수_정렬하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main { // 10989번
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort();
    }

    private static void sort() {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
