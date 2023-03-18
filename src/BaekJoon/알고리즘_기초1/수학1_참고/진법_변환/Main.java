package BaekJoon.알고리즘_기초1.수학1_참고.진법_변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 2745번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String number = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        System.out.println(decimalNumber(number, n));
    }

    private static int decimalNumber(String number, int n) {

        int sum = 0;
        int temp = 1;

        for (int i = number.length() - 1; i >= 0; i--) {
            if ('0' <= number.charAt(i) && number.charAt(i) <= '9') {
                sum += (number.charAt(i) - '0') * temp;
            } else {
                sum += (number.charAt(i) - 'A' + 10) * temp;
            }
            temp *= n;
        }

        return sum;
    }
}
