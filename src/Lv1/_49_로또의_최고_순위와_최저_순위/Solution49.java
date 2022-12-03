package Lv1._49_로또의_최고_순위와_최저_순위;

import java.util.Arrays;

public class Solution49 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int lottoCnt = 0, zeroCnt = 0, sum;

        for (int lotto : lottos) {
            if (lotto == 0)
                zeroCnt++;

            for (int j = 0; j < lottos.length; j++) {
                if (lotto == win_nums[j])
                    lottoCnt++;
            }
        }
        sum = lottoCnt + zeroCnt;

        if (sum == 6) answer[0] = 1;
        else if (sum == 5) answer[0] = 2;
        else if (sum == 4) answer[0] = 3;
        else if (sum == 3) answer[0] = 4;
        else if (sum == 2) answer[0] = 5;
        else answer[0] = 6;

        if (lottoCnt == 6) answer[1] = 1;
        else if (lottoCnt == 5) answer[1] = 2;
        else if (lottoCnt == 4) answer[1] = 3;
        else if (lottoCnt == 3) answer[1] = 4;
        else if (lottoCnt == 2) answer[1] = 5;
        else answer[1] = 6;

        return answer;
    }

    public static void main(String[] args) {
        Solution49 s = new Solution49();

        int[] lotto = {44, 1, 0, 0, 31, 25};
        int[] win_num = {31, 10, 45, 1, 6, 19};

        int[] lotto1 = {0, 0, 0, 0, 0, 0};
        int[] win_num1 = {38, 19, 20, 40, 15, 25};

        int[] lotto2 = {45, 4, 35, 20, 3, 9};
        int[] win_num2 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(s.solution(lotto, win_num)));
        System.out.println(Arrays.toString(s.solution(lotto1, win_num1)));
        System.out.println(Arrays.toString(s.solution(lotto2, win_num2)));
    }
}
