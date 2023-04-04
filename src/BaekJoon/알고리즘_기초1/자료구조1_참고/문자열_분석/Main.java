package BaekJoon.알고리즘_기초1.자료구조1_참고.문자열_분석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 10820번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int[] count;

        while ((s = br.readLine()) != null) {
            count = new int[4];

            for (int i = 0; i < s.length(); i++) {
                if (isaBoolean('a', 'z', s, i)) count[0]++;
                else if (isaBoolean('A', 'Z', s, i)) count[1]++;
                else if (isaBoolean('0', '9', s, i)) count[2]++;
                else count[3]++;
            }

            System.out.println(getStringBuffer(count));
        }
    }

    private static boolean isaBoolean(char first, char second, String s, int i) {
        return first <= s.charAt(i) && s.charAt(i) <= second;
    }

    private static StringBuffer getStringBuffer(int[] count) {
        StringBuffer sb = new StringBuffer();
        for (int c : count) {
            sb.append(c).append(" ");
        }
        return sb;
    }
}
