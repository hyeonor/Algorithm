package BaekJoon.알고리즘_기초1.자료구조1_연습.오등큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 17299번
    static Stack<Integer> stack = new Stack<>();
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int[] count = new int[n];
        int[] ans = new int[n];

        init(st, n, arr, count);

        NGF(n, arr, count, ans);

        System.out.println(getAnswer(n, ans));
    }

    private static void init(StringTokenizer st, int n, int[] arr, int[] count) {
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            count[i] = map.get(arr[i]);
        }
    }

    private static void NGF(int n, int[] arr, int[] count, int[] ans) {
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && count[stack.peek()] < count[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
    }

    private static StringBuffer getAnswer(int n, int[] ans) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append(ans[i]).append(" ");
        }

        return sb;
    }
}
