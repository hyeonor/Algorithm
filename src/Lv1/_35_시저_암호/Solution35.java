package Lv1._35_시저_암호;

public class Solution35 {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                answer.append((char) ('a' + (ch + n - 'a') % 26));
            } else {
                answer.append((char) ('A' + (ch + n - 'A') % 26));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution35 s = new Solution35();
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
        System.out.println(s.solution("ABC", 25));
    }
}