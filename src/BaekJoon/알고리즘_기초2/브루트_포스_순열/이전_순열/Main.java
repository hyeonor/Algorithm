package BaekJoon.알고리즘_기초2.브루트_포스_순열.이전_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 10973번
    static int N;
    static int[] arr;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i;
        for (i = N - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) break;
        }

        if (i == 0) System.out.print(-1);
        else {
            PreviousPermutation(i);
            getAns();
            System.out.print(sb);
        }
    }

    private static void PreviousPermutation(int i) {
        for (int j = N - 1; j > 0; j--) {
            if (arr[j] < arr[i - 1]) {
                swap(j, i - 1);
                break;
            }
        }

        int j = N - 1;
        while (i < j) {
            swap(i, j);
            i++;
            j--;
        }
    }

    private static void getAns() {
        for (int k = 0; k < N; k++) {
            sb.append(arr[k]).append(' ');
        }
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
