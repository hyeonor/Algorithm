package BaekJoon.알고리즘_기초1.수학1_참고.Base_Conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {// 11576번
    static int[] numbers;
    static int A;
    static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        decimalNumber(n);
    }

    private static void decimalNumber(int n) {

        int sum = 0;
        int temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            sum += temp * numbers[i];
            temp *= A;
        }

        List<Integer> list = new ArrayList<>();

        while (sum != 0) {
            list.add(sum % B);
            sum /= B;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
