package BaekJoon.알고리즘_기초1.자료구조1_연습.단어_뒤집기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {// 17413번
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        reverse(sentence);
    }

    private static void reverse(String sentence) {
        StringBuffer sb = new StringBuffer();

        boolean check = false;
        for (int i = 0; i < sentence.length(); i++) {
            char checkChar = sentence.charAt(i);

            if (checkChar == '<') {
                if (!stack.isEmpty()) {
                    NotEmptyPop(sb);
                }
                stack.push(checkChar);
                check = true;
            } else if (checkChar == '>') {
                for (Character character : stack)
                    sb.append(character);
                sb.append('>');
                stack.clear();
                check = false;
            } else if (check || checkChar != ' ') {
                stack.push(checkChar);
            } else {
                NotEmptyPop(sb);
                sb.append(' ');
            }
        }

        NotEmptyPop(sb);
        sb.append(' ');

        System.out.println(sb);
    }

    private static void NotEmptyPop(StringBuffer sb) {
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }
}
