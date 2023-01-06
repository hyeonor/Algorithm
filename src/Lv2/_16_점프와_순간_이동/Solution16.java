package Lv2._16_점프와_순간_이동;

public class Solution16 {
    public int solution(int n) {
        int ans = 1;

        while (n > 2) {
            // 홀수 개수 체크
            if (n % 2 != 0)
                ans++;
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution16 s = new Solution16();

        System.out.println(s.solution(5));
        System.out.println(s.solution(6));
        System.out.println(s.solution(5000));
    }
}
