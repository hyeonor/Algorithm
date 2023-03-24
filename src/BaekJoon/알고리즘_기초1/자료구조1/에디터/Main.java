package BaekJoon.알고리즘_기초1.자료구조1.에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {// 1406번
    static Stack<Character> leftStack = new Stack<>();
    static Stack<Character> rightStack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String first = br.readLine();

        for (int i = 0; i < first.length(); i++) {
            leftStack.push(first.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            command(st, s);
        }

        System.out.println(getAnswer());
    }

    private static void left() {
        if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
    }

    private static void right() {
        if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
    }

    private static void leftDelete() {
        if (!leftStack.isEmpty()) leftStack.pop();
    }

    private static void rightAdd(char c) {
        leftStack.push(c);
    }

    private static void command(StringTokenizer st, String s) {
        switch (s) {
            case "L":
                left();
                break;
            case "D":
                right();
                break;
            case "B":
                leftDelete();
                break;
            default:
                rightAdd(st.nextToken().charAt(0));
                break;
        }
    }

    private static StringBuffer getAnswer() {
        StringBuffer sb = new StringBuffer();

        if (!leftStack.isEmpty()) {
            for (Character character : leftStack) {
                sb.append(character);
            }
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        
        return sb;
    }
}
