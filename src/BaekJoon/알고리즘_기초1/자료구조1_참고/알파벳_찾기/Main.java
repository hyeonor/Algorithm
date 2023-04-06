package BaekJoon.알고리즘_기초1.자료구조1_참고.알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    static String word;
    static TreeMap<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();

        int aInt = 97;
        for (int i = 0; i < 26; i++) {
            map.put(aInt++, -1);
        }

        System.out.println(FindAlphabet());
    }

    private static StringBuffer FindAlphabet() {
        for (int i = 0; i < word.length(); i++) {
            if (map.get((int) word.charAt(i)) == -1)
                map.put((int) word.charAt(i), i);
        }

        StringBuffer sb = new StringBuffer();
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            sb.append(value).append(" ");
        }

        return sb;
    }
}
