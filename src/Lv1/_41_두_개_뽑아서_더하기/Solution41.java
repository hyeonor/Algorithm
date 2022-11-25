package Lv1._41_두_개_뽑아서_더하기;

import java.util.Arrays;
import java.util.HashSet;

public class Solution41 {

    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution41 s = new Solution41();
        int[] array1 = {4, 1, 3, 2, 1};
        int[] array2 = {5, 0, 2, 7};

        System.out.println(Arrays.toString(s.solution(array1)));
        System.out.println(Arrays.toString(s.solution(array2)));
    }
}
