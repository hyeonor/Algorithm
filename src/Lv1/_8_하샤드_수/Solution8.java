package Lv1._8_하샤드_수;

public class Solution8 {

    public boolean solution(int x) {
        int n = x;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();

        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
        System.out.println(s.solution(11));
        System.out.println(s.solution(13));
        System.out.println(s.solution(15));
    }
}
