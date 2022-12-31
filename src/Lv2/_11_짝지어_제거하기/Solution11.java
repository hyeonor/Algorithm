package Lv2._11_짝지어_제거하기;

import java.util.Stack;

public class Solution11 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) stack.pop(); //peek() 최근에 추가된(Top) 데이터 조회
            else stack.push(ch);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();

        System.out.println(s.solution("baabaa"));
        System.out.println(s.solution("cdcd"));
    }
}
