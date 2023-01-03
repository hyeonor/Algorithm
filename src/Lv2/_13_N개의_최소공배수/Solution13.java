package Lv2._13_N개의_최소공배수;

public class Solution13 {

    public int solution(int[] arr) {
        int gcd;
        int answer = arr[0];

        for (int a : arr) {
            gcd = gcd(answer, a);
            answer = answer * a / gcd;
        }

        return answer;
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;
        else
            return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Solution13 s = new Solution13();

        int[] arr1 = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};

        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
    }
}
