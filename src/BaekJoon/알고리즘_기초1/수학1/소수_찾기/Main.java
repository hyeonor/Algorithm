package BaekJoon.알고리즘_기초1.수학1.소수_찾기;

import java.util.Scanner;

public class Main {// 1978번
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            arr[i] = k;
        }

        for (int k : arr) {
            int cnt = 0;

            if (k == 1) cnt = -1;
            else {
                for (int j = 2; j < Math.abs(k); j++) {
                    if (k % j == 0) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt == 0) answer++;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.solution();
    }
}
