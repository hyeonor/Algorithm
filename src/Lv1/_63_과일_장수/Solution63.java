package Lv1._63_과일_장수;

import java.util.Arrays;

public class Solution63 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for (int i = score.length; i >= m ; i = i - m) {
            answer += m * score[i - m];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution63 s = new Solution63();
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int[] score3 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2, 1, 1, 1};

        System.out.println(s.solution(3, 4, score1));
        System.out.println(s.solution(4, 3, score2));
        System.out.println(s.solution(4, 3, score3));
    }
}
