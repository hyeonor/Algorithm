package Lv1._45_모의고사;

import java.util.Arrays;

public class Solution45 {

    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        int[] answer = new int[3];
        int max, cnt = 0;


        for (int i = 0; i < answers.length; i++) {
            if (first[i % 5] == answers[i]) score[0]++;
            if (second[i % 8] == answers[i]) score[1]++;
            if (third[i % 10] == answers[i]) score[2]++;
        }

        max = Math.max(Math.max(score[0], score[1]), score[2]);

        for (int i = 0; i < score.length; i++) {
            if (score[i] == max)
                answer[cnt++] = i + 1;
        }

        return Arrays.copyOf(answer, cnt);
    }

    public static void main(String[] args) {
        Solution45 s = new Solution45();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));
    }
}
