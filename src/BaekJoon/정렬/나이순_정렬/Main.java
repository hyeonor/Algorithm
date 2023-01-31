package BaekJoon.정렬.나이순_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main { //10814번

    public static void sort(String[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s[0])));

        for (String[] a : arr) {
            System.out.println(a[0] + " " + a[1]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        sort(arr);
    }
}
