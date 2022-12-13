package Lv1._59_콜라_문제;

public class Solution59 {

    public int solution(int a, int b, int n) {
        int answer = 0, rem;

        while (n >= a) {
            answer += (n / a) * b;
            rem = n % a;
            n = (n / a) * b + rem;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution59 s = new Solution59();

        System.out.println(s.solution(2, 1, 20));
        System.out.println(s.solution(3, 1, 20));
        System.out.println(s.solution(3, 2, 20));
    }
}
