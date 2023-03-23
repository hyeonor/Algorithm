package BaekJoon.알고리즘_기초1.자료구조1.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main { //10828번
    static Stack<String> stack = new Stack<>();

    public static void push(int n) {
        stack.push(n + "");
    }

    public static void pop() {
        if (!stack.isEmpty()) System.out.println(stack.pop());
        else System.out.println("-1");
    }

    public static void size() {
        System.out.println(stack.size());
    }

    public static void empty() {
        if (!stack.isEmpty()) System.out.println("0");
        else System.out.println("1");
    }

    public static void top() {
        if (!stack.isEmpty()) System.out.println(stack.peek());
        else System.out.println("-1");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            switch (s) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                default:
                    top();
                    break;
            }
        }
    }
}
