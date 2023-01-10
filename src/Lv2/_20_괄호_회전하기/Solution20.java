package Lv2._20_괄호_회전하기;

import java.util.Stack;

public class Solution20 {

    public int solution(String s) {
        int answer = 0;
        char temp;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            for (char c : arr) {
                if (c == '[' || c == '{' || c == '(')
                    stack.push(c);
                else if (!stack.empty()) {
                    if (stack.peek() == '[' && c == ']')
                        stack.pop();
                    else if (stack.peek() == '{' && c == '}')
                        stack.pop();
                    else if (stack.peek() == '(' && c == ')')
                        stack.pop();
                }
            }

            if (arr[0] != ']' && arr[0] != '}' && arr[0] != ')') {
                if (stack.empty()) answer++;
            }

            stack.clear();

            temp = arr[0];
            System.arraycopy(arr, 1, arr, 0, s.length() - 1);
            arr[s.length() - 1] = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution20 s = new Solution20();

        System.out.println(s.solution("[](){}"));
        System.out.println(s.solution("}]()[{"));
        System.out.println(s.solution("[)(]"));
        System.out.println(s.solution("}}}"));
    }
}