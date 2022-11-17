package Lv1._33_3진법_뒤집기;

public class Solution33 {

    public int solution(int n) {
        StringBuilder ans = new StringBuilder();
        int answer;

        while(n > 0) {
            ans.append(n % 3);
            n = n / 3;
        }
        answer = Integer.parseInt(ans.toString(),3);

        return answer;
    }

    public static void main(String[] args) {
        Solution33 s = new Solution33();

        System.out.println(s.solution(s.solution(45)));
        System.out.println(s.solution(s.solution(125)));
    }
}
