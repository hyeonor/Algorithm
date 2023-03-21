package BaekJoon.알고리즘_기초1.자료구조1.단어_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {// 9093번
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        System.out.println(reverse(n));
        System.out.println(reverse2(n));
    }

    private static StringBuffer reverse(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            String[] word = arr[i].split(" ");

            for (String s : word) {
                for (int c = s.length() - 1; c >= 0; c--) {
                    sb.append(s.charAt(c));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        return sb;
    }

    private static StringBuffer reverse2(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            for (char c : arr[i].toCharArray()) {
                if (c == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else stack.push(c);
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.append("\n");
        }

        return sb;
    }
}
