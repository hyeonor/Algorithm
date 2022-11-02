package Lv1._18_제일_작은_수_제거하기;

import java.util.Arrays;

public class Solution18 {

    public int[] solution(int[] arr) {
        int[] answer;

        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            int min = arr[0];

            for (int a : arr) {
                if (a < min)
                    min = a;
            }

            int index = 0;
            for (int a : arr) {
                if (min == a) {
                    continue;
                }
                answer[index++] = a;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution18 s = new Solution18();

        int[] arr1 = {4, 3, 2, 1};
        int[] arr2 = {10};

        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));
    }
}
