package Lv1._39_K_번째_수;

import java.util.Arrays;

public class Solution39 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            int cnt = 0;
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arr[cnt++] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution39 s = new Solution39();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(s.solution(array, commands)));
    }
}
