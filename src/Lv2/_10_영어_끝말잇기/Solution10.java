package Lv2._10_영어_끝말잇기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution10 {

    public int[] solution(int n, String[] words) {
        Set<String> hs = new HashSet<>();
        hs.add(words[0]);
        int i = 0;

        while (++i < words.length) {
            String pre = words[i - 1], cur = words[i];
            // contains: 요소 존재 여부 체크
            if (hs.contains(cur) || pre.charAt(pre.length() - 1) != cur.charAt(0)) {
                return new int[]{i % n + 1, i / n + 1};
            }
            hs.add(cur);
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();

        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
                            "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        String[] words4 = {"land", "dream", "mom", "mom", "ror"};

        System.out.println(Arrays.toString(s.solution(3, words1)));
        System.out.println(Arrays.toString(s.solution(5, words2)));
        System.out.println(Arrays.toString(s.solution(2, words3)));
        System.out.println(Arrays.toString(s.solution(2, words4)));
    }
}
