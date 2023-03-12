package BaekJoon.알고리즘_기초1.수학1_연습._8진수_2진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 1212번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        binaryNumber(s);
    }

    private static void binaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') sb.append("000");
            else if (s.charAt(i) == '1') sb.append("001");
            else if (s.charAt(i) == '2') sb.append("010");
            else if (s.charAt(i) == '3') sb.append("011");
            else if (s.charAt(i) == '4') sb.append("100");
            else if (s.charAt(i) == '5') sb.append("101");
            else if (s.charAt(i) == '6') sb.append("110");
            else sb.append("111");
        }

        System.out.println(sb.toString().replaceFirst("^0+(?!$)", ""));
    }
}
