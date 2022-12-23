package Lv2._03_최솟값_만들기;

import java.util.Arrays;

public class Solution3 {

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[(A.length - 1) - i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();

        int[] a1 = {1, 4, 2};
        int[] b1 = {5, 4, 4};
        int[] a2 = {1, 2};
        int[] b2 = {3, 4};

        System.out.println(s.solution(a1, b1));
        System.out.println(s.solution(a2, b2));
    }
}
