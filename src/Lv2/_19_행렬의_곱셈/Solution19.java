package Lv2._19_행렬의_곱셈;

import java.util.Arrays;

public class Solution19 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int z = 0; z < arr1[0].length; z++) {
                    answer[i][j] += arr1[i][z] * arr2[z][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution19 s = new Solution19();

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] arr3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        System.out.println(Arrays.deepToString(s.solution(arr1, arr2)));
        System.out.println(Arrays.deepToString(s.solution(arr3, arr4)));
    }
}
