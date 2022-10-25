package Lv1._09_정수_내림차순으로_배치하기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution9 {

    public long solution(long n) {
        long answer = 0;
        List<Long> lists = new ArrayList<>();

        while (n > 0) {
            lists.add(n % 10);
            n /= 10;
        }

        lists.sort(Comparator.reverseOrder());

        for (Long list : lists) {
            answer = (answer * 10) + list;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();

        System.out.println(s.solution(118372));
    }
}
