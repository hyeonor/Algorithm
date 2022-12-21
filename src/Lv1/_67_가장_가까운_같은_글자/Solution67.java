package Lv1._67_가장_가까운_같은_글자;

import java.util.Arrays;
import java.util.HashMap;

public class Solution67 {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i)))
                answer[i] = i - hashMap.get(s.charAt(i));
            else
                answer[i] = -1;

            hashMap.put(s.charAt(i), i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution67 s = new Solution67();

        System.out.println(Arrays.toString(s.solution("banana")));
        System.out.println(Arrays.toString(s.solution("foobar")));
        System.out.println(Arrays.toString(s.solution("aaabbbccc")));
    }
}
