package Lv1._43_포켓몬;

import java.util.HashSet;

public class Solution43 {

    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        return Math.min(set.size(), nums.length / 2);
    }

    public static void main(String[] args) {
        Solution43 s = new Solution43();

        int[] arr = {3, 1, 2, 3};
        int[] arr1 = {3, 3, 3, 2, 2, 4};
        int[] arr2 = {3, 3, 3, 2, 2, 2};

        System.out.println(s.solution(arr));
        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
    }
}
