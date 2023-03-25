package BaekJoon.알고리즘_기초1.자료구조1.스택_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {// 1874번

    public static void sort(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        String[] stackAnswer = new String[n * 2];
        int index = 0, sIndex = 0;

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            stackAnswer[sIndex++] = "+";

            while (!stack.isEmpty()) {
                if (arr[index] == stack.peek()) {
                    stackAnswer[sIndex++] = "-";
                    stack.pop();
                    index++;
                } else break;
            }
        }

        if (stack.isEmpty()) System.out.println(String.join("\n", stackAnswer));
        else System.out.println("NO");
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
