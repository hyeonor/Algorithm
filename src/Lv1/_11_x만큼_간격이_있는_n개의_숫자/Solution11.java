package Lv1._11_x만큼_간격이_있는_n개의_숫자;

import java.util.Arrays;

public class Solution11 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1] + x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();

        System.out.println(Arrays.toString(s.solution(2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 3)));
        System.out.println(Arrays.toString(s.solution(-4, 2)));

    }
}
