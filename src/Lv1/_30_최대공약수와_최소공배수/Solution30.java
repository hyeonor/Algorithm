package Lv1._30_최대공약수와_최소공배수;

import java.util.Arrays;

public class Solution30 {

    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int[] answer = new int[2];

        answer[0] = gcd;
        answer[1] = n * m / gcd;

        return answer;
    }

    public static void main(String[] args) {
        Solution30 s = new Solution30();

        System.out.println(Arrays.toString(s.solution(3, 12)));
        System.out.println(Arrays.toString(s.solution(2, 5)));
    }
}
