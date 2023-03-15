package BaekJoon.알고리즘_기초1.수학1_연습.음수_2진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 2089번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();

        if (num == 0) {
            System.out.println(num);
            return;
        }

        while (num != 0) {
            if (num % -2 == -1) {
                sb.append((num % -2) + 2);
                num = (num / -2) + 1;
            } else {
                sb.append((num % -2));
                num = num / -2;
            }
        }

        System.out.println(sb.reverse());
    }
}
