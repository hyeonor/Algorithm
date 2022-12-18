package Lv1._64_기사단원의_무기;

public class Solution64 {

    public int solution(int number, int limit, int power) {
        int answer = 0, cnt = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }

            if (cnt <= limit) answer += cnt;
            else answer += power;
            cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution64 s = new Solution64();

        System.out.println(s.solution(5, 3, 2));
        System.out.println(s.solution(10, 3, 2));
    }
}