package Lv1._31_같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution31 {

    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i])
                list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));
    }
}
