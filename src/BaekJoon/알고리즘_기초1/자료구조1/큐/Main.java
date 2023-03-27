package BaekJoon.알고리즘_기초1.자료구조1.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main { //10845번
    static Queue<Integer> queue = new LinkedList<>();
    static int list = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            command(st, s);
        }
    }

    private static void command(StringTokenizer st, String s) {
        switch (s) {
            case "push":
                list = Integer.parseInt(st.nextToken());
                push(list);
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
            case "front":
                front();
                break;
            default:
                if (!queue.isEmpty()) System.out.println(list);
                else System.out.println(-1);
                break;
        }
    }

    public static void push(int n) {
        queue.add(n);
    }

    public static void pop() {
        if (!queue.isEmpty()) System.out.println(queue.poll());
        else System.out.println(-1);
    }

    public static void size() {
        System.out.println(queue.size());
    }

    public static void empty() {
        if (!queue.isEmpty()) System.out.println(0);
        else System.out.println(1);
    }

    public static void front() {
        if (!queue.isEmpty()) System.out.println(queue.peek());
        else System.out.println(-1);
    }
}
