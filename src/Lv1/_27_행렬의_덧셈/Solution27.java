package Lv1._27_행렬의_덧셈;

import java.util.Arrays;

public class Solution27 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr1[0].length;
        int[][] answer = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution27 s = new Solution27();

        int[][] n1 = {{1, 2}, {2, 3}};
        int[][] m1 = {{3, 4}, {5, 6}};
        int[][] n2 = {{1}, {2}};
        int[][] m2 = {{3}, {4}};

        System.out.println(Arrays.deepToString(s.solution(n1, m1)));
        System.out.println(Arrays.deepToString(s.solution(n2, m2)));
    }
}
