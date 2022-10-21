package Lv1._6_자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Solution6 {

    public int[] solution(long n) {
        int[] answer = new int[(int) (Math.log10(n) + 1)];
        int cnt = 0;

        while (n > 0) {
            answer[cnt++] = (int) (n % 10);
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();

        long l = 12345;

        System.out.println(Arrays.toString(s.solution(l)));
    }
}
