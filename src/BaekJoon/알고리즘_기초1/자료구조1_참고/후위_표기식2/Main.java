package BaekJoon.알고리즘_기초1.자료구조1_참고.후위_표기식2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {// 1935번
    static Stack<Double> stack = new Stack<>();
    static Map<Integer, Double> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.printf("%.2f", Postfix(br, n, s));
    }

    private static Double Postfix(BufferedReader br, int n, String s) throws IOException {
        int alphabet = 65;
        for (int i = 0; i < n; i++) {
            map.put(alphabet++, (double) Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
                stack.push(map.get((int) s.charAt(i)));
            else {
                double first = stack.pop();
                double second = stack.pop();
                double result;

                if (s.charAt(i) == '+')
                    result = second + first;
                else if (s.charAt(i) == '-')
                    result = second - first;
                else if (s.charAt(i) == '*')
                    result = second * first;
                else
                    result = second / first;

                stack.push(result);
            }
        }

        return stack.pop();
    }
}
