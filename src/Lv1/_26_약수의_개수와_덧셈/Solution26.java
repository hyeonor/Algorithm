package Lv1._26_약수의_개수와_덧셈;

public class Solution26 {

    public int solution(int left, int right) {
        int answer = 0;

        for (int num = left; num <= right; num++) {
            int cnt = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) cnt++;
            }

            if (cnt % 2 == 0)
                answer += num;
            else
                answer -= num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution26 s = new Solution26();

        System.out.println(s.solution(13, 17));
        System.out.println(s.solution(24, 27));
    }
}
