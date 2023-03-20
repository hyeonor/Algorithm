package BaekJoon.알고리즘_기초1.자료구조1.괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {// 9012번

    static String vps(String s) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') stack.push(s.charAt(j));
            else {
                if (!stack.empty()) stack.pop();
                else return "NO";
            }
        }

        if (stack.empty()) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            String s = scanner.next();
            System.out.println(vps(s));
        }
    }
}
