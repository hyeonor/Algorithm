package Lv1._22_가운데_글자_가져오기;

public class Solution22 {

    public String solution(String s) {
        String answer;
        int quotient = s.length() / 2;

        if (s.length() % 2 == 1) {
            answer = s.substring(quotient, quotient + 1);
        } else {
            answer = s.substring(quotient - 1, quotient + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();

        System.out.println(s.solution("abcde"));
        System.out.println(s.solution("qwer"));
    }
}
