package BaekJoon.정렬.로프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main { //2217번
    public static void sort (int[] arr, int n) {
        Arrays.sort(arr);

        int max = arr[0] * n;
        for (int i = 1; i < n; i++) {
            int num = arr[i] * (n - i);
            if(max < num)
                max = num;
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort(arr, n);
    }
}
