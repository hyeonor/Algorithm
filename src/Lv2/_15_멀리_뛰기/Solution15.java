package Lv2._15_멀리_뛰기;

public class Solution15 {

    public long solution(int n) {
        long answer = 1, num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            answer = (num1 + num2) % 1234567;
            num1 = num2;
            num2 = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();

        System.out.println(s.solution(4));
        System.out.println(s.solution(3));
    }
}
