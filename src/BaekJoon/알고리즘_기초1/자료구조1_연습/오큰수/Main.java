package BaekJoon.알고리즘_기초1.자료구조1_연습.오큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {// 17298번
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int[] ans = new int[n];

        init(st, n, arr);

        NGE(n, arr, ans);

        System.out.println(getStringBuffer(n, ans));
    }

    private static void init(StringTokenizer st, int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void NGE(int n, int[] arr, int[] ans) {
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
    }

    private static StringBuffer getStringBuffer(int n, int[] ans) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i]).append(" ");
        }
        return sb;
    }
}
