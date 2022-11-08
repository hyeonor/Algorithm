package Lv1._24_문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution24 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] num = s.split("");

        Arrays.sort(num, Collections.reverseOrder());

        for(String a : num)
            answer.append(a);

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution24 s = new Solution24();

        System.out.println(s.solution("Zbcdefg"));
    }
}
