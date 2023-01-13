package Lv2._23_n제곱_배열_자르기;

import java.util.Arrays;

public class Solution23 {

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        int index = 0;

        for (long i = left; i <= right; i++) {
            answer[index++] = (int) (Math.max(i / n, i % n) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution23 s = new Solution23();

        System.out.println(Arrays.toString(s.solution(3, 2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 7, 14)));
    }
}
