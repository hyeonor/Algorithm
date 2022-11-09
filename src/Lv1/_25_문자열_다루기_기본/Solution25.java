package Lv1._25_문자열_다루기_기본;

import java.util.regex.Pattern;

public class Solution25 {

    public boolean solution(String s) {
        String pattern = "^\\d*$"; // 숫자만 등장하는지
        boolean result = Pattern.matches(pattern, s);

        return (4 == s.length() || s.length() == 6) && result;
    }

    public static void main(String[] args) {
        Solution25 s = new Solution25();

        System.out.println(s.solution("a234"));
        System.out.println(s.solution("1234"));
    }
}
