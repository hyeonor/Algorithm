package BaekJoon.알고리즘_기초1.수학1_참고.진법_변환_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 11005번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long number = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        notation(number, n);
    }

    private static void notation(long number, int n) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            // 만약 N으로 나누었는데 10보다 작다면 해당 숫자를 바로 append
            if (number % n < 10) {
                sb.append(number % n);

                // 만약 n이 10보다 큰 경우, n으로 나누었는데 10 이상이면 A, B 등으로 표현하므로 기존 숫자는 10진법이므로 10만큼 빼고 'A'를 더한다.
                // 왜냐면 1~9까지는 숫자로 표기하지만, 10 부터는 'A', 'B' 순서로 나타내기 때문이다.
                // 나머지가 10이라면 'A' + 10이 아니라 'A'로 나타내야 하기 때문
            } else {
                sb.append((char) (number % n - 10 + 'A'));
            }
            number /= n;
        }

        System.out.println(sb.reverse());
    }
}
