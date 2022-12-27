package Lv2._06_숫자의_표현;

public class Solution6 {

    public int solution(int n) {
        int answer = 1; //최소값 = 자기 자신

        for(int i = 1; i <= n / 2; i++) {
            int sum = i;

            for(int j = i + 1; sum < n; j++)
                sum += j;

            if(sum == n) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();

        System.out.println(s.solution(15));
    }
}
