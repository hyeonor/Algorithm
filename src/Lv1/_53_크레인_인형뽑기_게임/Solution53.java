package Lv1._53_크레인_인형뽑기_게임;

import java.util.Stack;

public class Solution53 {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution53 s = new Solution53();

        int[][] boardArr = {{0, 0, 0, 0, 0},
                            {0, 0, 1, 0, 3},
                            {0, 2, 5, 0, 1},
                            {4, 2, 4, 4, 2},
                            {3, 5, 1, 3, 1}};

        int[] movesArr = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(s.solution(boardArr, movesArr));

    }
}
