package Lv2._04_올바른_괄호;

import java.util.Stack;

public class Solution4 {

    boolean solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(arr[0] == ')') return false;

        for (char c : arr) {
            if (c == '(') stack.push(c);
            if (c == ')' && !stack.empty()) stack.pop();
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();

        System.out.println(s.solution("()()"));
        System.out.println(s.solution("(())()"));
        System.out.println(s.solution(")()("));
        System.out.println(s.solution("(()("));
    }
}
