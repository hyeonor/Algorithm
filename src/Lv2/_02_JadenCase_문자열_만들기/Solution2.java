package Lv2._02_JadenCase_문자열_만들기;

import java.util.Objects;

public class Solution2 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String sLowerCase = s.toLowerCase();
        String[] arr = sLowerCase.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (!Objects.equals(arr[i], "")) {
                if (i != arr.length - 1)
                    answer.append(arr[i].substring(0, 1).toUpperCase()).append
                            (arr[i].substring(1)).append(" ");
                else
                    answer.append(arr[i].substring(0, 1).toUpperCase()).append
                            (arr[i].substring(1));
            } else {
                answer.append(" ");
            }
        }

        if (s.endsWith(" "))
            answer.append(" ");

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();

        System.out.println(s.solution("3people unFollowed me"));
        System.out.println(s.solution("for   the last week "));
    }
}
