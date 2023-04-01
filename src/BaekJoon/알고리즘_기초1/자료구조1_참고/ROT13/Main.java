package BaekJoon.알고리즘_기초1.자료구조1_참고.ROT13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 11655번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.print(ROT13(s));
    }

    private static StringBuffer ROT13(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                if ((s.charAt(i) + 13) > 'Z')
                    sb.append((char) (s.charAt(i) - 13));
                else
                    sb.append((char) (s.charAt(i) + 13));
            } else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                if ((s.charAt(i) + 13) > 'z')
                    sb.append((char) (s.charAt(i) - 13));
                else
                    sb.append((char) (s.charAt(i) + 13));
            } else
                sb.append(s.charAt(i));
        }

        return sb;
    }
}
