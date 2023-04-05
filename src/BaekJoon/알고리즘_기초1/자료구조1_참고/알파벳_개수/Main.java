package BaekJoon.알고리즘_기초1.자료구조1_참고.알파벳_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {// 10808번
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(getCount(s));
        System.out.println(getCount2(s));
    }

    private static StringBuffer getCount(String s) {
        int[] ans = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - (int) 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        for (int a : ans) {
            sb.append(a).append(' ');
        }

        return sb;
    }

    private static StringBuffer getCount2(String s) {
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int alphabet = 97;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            if (map.containsKey((char) alphabet))
                sb.append(map.get((char) alphabet)).append(' ');
            else
                sb.append("0 ");

            alphabet++;
        }

        return sb;
    }
}
