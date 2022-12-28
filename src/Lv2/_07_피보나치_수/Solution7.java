package Lv2._07_피보나치_수;

public class Solution7 {
    public int solution(int n) {
        int answer = 1, num1 = 0, num2 = 1;

        for (int i = 2; i <= n; i++) {
            answer = (num1 + num2) % 1234567;
            num1 = num2;
            num2 = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();

        System.out.println(s.solution(3));
        System.out.println(s.solution(5));
        System.out.println(s.solution(100000));
    }
}
