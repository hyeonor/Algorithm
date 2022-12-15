package Lv1._61_햄버거_만들기;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution61 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int ing : ingredient) {
            stack.push(ing);
            if (stack.size() >= 4
                && stack.get(stack.size() - 4) == 1
                && stack.get(stack.size() - 3) == 2
                && stack.get(stack.size() - 2) == 3
                && stack.get(stack.size() - 1) == 1) {
                for (int k = 0; k < 4; k++)
                    stack.pop();
                answer++;
            }
        }

        return answer;
    }

    public int solution1(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int element : ingredient) {
            list.add(element);
        }

        for (int i = 0; i < list.size() - 3; i++) {
            if (i <= list.size() - 4
                    && list.get(i) == 1
                    && list.get(i + 1) == 2
                    && list.get(i + 2) == 3
                    && list.get(i + 3) == 1) {

                for (int j = 0; j < 4; j++) {
                    list.remove(i);
                }
                answer++;

                i = i > 4 ? i - 5 : -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution61 s = new Solution61();
        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        System.out.println(s.solution(ingredient1));
        System.out.println(s.solution(ingredient2));
        System.out.println(s.solution1(ingredient1));
        System.out.println(s.solution1(ingredient2));
    }
}

//        int answer = 0;
//        List<Integer> list = new ArrayList<>();
//
//        for (int element : ingredient) {
//            list.add(element);
//        }
//
//        for (int i = 0; i < list.size() - 3; i++) {
//            if (list.get(i) == 1
//                && list.get(i + 1) == 2
//                && list.get(i + 2) == 3
//                && list.get(i + 3) == 1) {
//
//                for (int j = 0; j < 4; j++) {
//                    list.remove(i);
//                }
//                answer++;
//
//                i = 0;
//            }
//        }
//
//        return answer;
