package BaekJoon.알고리즘_기초1.자료구조1_연습.쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main { // 10799번
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = br.readLine();

        System.out.println(laser(parenthesis));
    }

    private static int laser(String parenthesis) {
        int ans = 0;
        for (int i = 0; i < parenthesis.length(); i++) {
            char nowChar = parenthesis.charAt(i);

            if (nowChar == '(') {
                stack.push(nowChar);
            } else {
                stack.pop();
                if (parenthesis.charAt(i - 1) == '(') ans += stack.size();
                else ans++;
            }
        }

        return ans;
    }
}
