package BaekJoon.알고리즘_기초1.수학1_연습._2진수_8진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 1373번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        octalNumber(s);
    }

    private static void octalNumber(String s) {
        long n = 0;
        long cnt = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (cnt % 3 == 0) {
                n += (s.charAt(i) - '0');
            } else if (cnt % 3 == 1) {
                n += 2 * (s.charAt(i) - '0');
            } else {
                n += 4 * (s.charAt(i) - '0');
                sb.append(n);
                n = 0;
            }
            cnt++;
        }

        if (n != 0) sb.append(n);

        if (sb.length() == 0) System.out.println(0);
        else System.out.println(sb.reverse());
    }
}
