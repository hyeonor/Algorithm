package Lv1._34_예산;

import java.util.Arrays;

public class Solution34 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for (int list : d) {
            sum += list;
            if (sum <= budget) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution34 s = new Solution34();

        int[] arr1 = {1, 3, 2, 5, 4};
        int[] arr2 = {2, 2, 3, 3};

        System.out.println(s.solution(arr1, 9));
        System.out.println(s.solution(arr2, 10));
    }
}
