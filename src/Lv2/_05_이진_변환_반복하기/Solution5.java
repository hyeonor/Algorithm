package Lv2._05_이진_변환_반복하기;

import java.util.Arrays;

public class Solution5 {

    public int[] solution(String s) {
        int[] answer = new int[2];
        int oldLength, newLength;

        while (!s.equals("1")) {
            oldLength = s.length();
            s = s.replaceAll("0", "");
            newLength = s.length();

            answer[1] += oldLength - newLength;
            s = Integer.toBinaryString(newLength);

            answer[0]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();

        System.out.println(Arrays.toString(s.solution("110010101001")));
        System.out.println(Arrays.toString(s.solution("01110")));
        System.out.println(Arrays.toString(s.solution("1111111")));
    }

}
