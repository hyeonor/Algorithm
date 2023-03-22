package BaekJoon.알고리즘_기초1.자료구조1.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main { //10866번

    static Deque<String> deque = new ArrayDeque<>();

    public static void pushFront(String n) {
        deque.addFirst(n);
    }

    public static void pushBack(String n) {
        deque.addLast(n);
    }

    public static void popFront() {
        if (!deque.isEmpty()) System.out.println(deque.pollFirst());
        else System.out.println("-1");
    }

    public static void popBack() {
        if (!deque.isEmpty()) System.out.println(deque.pollLast());
        else System.out.println("-1");
    }

    public static void size() {
        System.out.println(deque.size());
    }

    public static void empty() {
        if (!deque.isEmpty()) System.out.println("0");
        else System.out.println("1");
    }

    public static void front() {
        if (!deque.isEmpty()) System.out.println(deque.peekFirst());
        else System.out.println("-1");
    }

    public static void back() {
        if (!deque.isEmpty()) System.out.println(deque.peekLast());
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
                case "push_front":
                    pushFront(st.nextToken());
                    break;
                case "push_back":
                    pushBack(st.nextToken());
                    break;
                case "pop_front":
                    popFront();
                    break;
                case "pop_back":
                    popBack();
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
                    back();
                    break;
            }
        }
    }
}
