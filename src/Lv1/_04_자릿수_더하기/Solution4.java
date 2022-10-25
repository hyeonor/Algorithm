package Lv1._04_자릿수_더하기;

public class Solution4 {

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();

        System.out.println(s.solution(123));
        System.out.println(s.solution(987));
    }
}
