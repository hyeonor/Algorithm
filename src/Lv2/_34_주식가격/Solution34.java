package Lv2._34_주식가격;

import java.util.Arrays;
import java.util.Stack;

public class Solution34 {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
            if (answer[i] == 0)
                answer[i] = prices.length - 1 - i;
        }

        return answer;
    }

    public int[] solution2(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int[] answer = new int[prices.length];

        stack.push(i);
        for (i = 1; i < prices.length; i++) {
            while (!stack.empty() && prices[i] < prices[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            int index = stack.pop();
            answer[index] = i - index - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution34 s = new Solution34();

        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(s.solution(prices)));
        System.out.println(Arrays.toString(s.solution2(prices)));
    }
}
