package Lv2._26_1차_뉴스_클러스터링;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class Solution26 {

    public int solution(String str1, String str2) {
        ArrayList<String> str1Arr = new ArrayList<>();
        ArrayList<String> str2Arr = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            if (Pattern.matches("^[a-zA-Z]*$", str1.substring(i, i + 2)))
                str1Arr.add(str1.substring(i, i + 2).toUpperCase());
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            if (Pattern.matches("^[a-zA-Z]*$", str2.substring(i, i + 2)))
                str2Arr.add(str2.substring(i, i + 2).toUpperCase());
        }

        int temp = str1Arr.size() + str2Arr.size();

        Collections.sort(str1Arr);
        Collections.sort(str2Arr);

        for (String s : str1Arr) { // 교집합
            if (str2Arr.remove(s))
                intersection.add(s);
        }

        if (!str1Arr.isEmpty() || !str2Arr.isEmpty()) {
            int numerator = intersection.size();
            int denominator = temp - numerator;
            double fraction = (double) numerator / (double)denominator;

            return (int) (fraction * 65536);
        } else {
            return 65536;
        }
    }

    public static void main(String[] args) {
        Solution26 s = new Solution26();

        System.out.println(s.solution("FRANCE", "french")); // 16384
        System.out.println(s.solution("handshake", "shake hands")); // 65536
        System.out.println(s.solution("aa1+aa2", "AAAA12")); // 43690
        System.out.println(s.solution("E=M*C^2", "e=m*c^2")); // 65536
        System.out.println(s.solution("aa1+aa2", "AA12")); // 32768
        System.out.println(s.solution("abc", "abbb")); // 16384
        System.out.println(s.solution("aaa", "bbb")); // 65536
        System.out.println(s.solution("BAAAA", "AAA")); // 32768
    }
}
