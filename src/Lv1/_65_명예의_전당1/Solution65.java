package Lv1._65_명예의_전당1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution65 {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k)
                pq.add(score[i]);
            else {
                pq.add(score[i]);
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution65 s = new Solution65();

        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] score3 = {10, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] score4 = {2, 3, 1};

        System.out.println(Arrays.toString(s.solution(3, score1)));
        System.out.println(Arrays.toString(s.solution(4, score2)));
        System.out.println(Arrays.toString(s.solution(11, score3)));
        System.out.println(Arrays.toString(s.solution(5, score4)));
    }
}
