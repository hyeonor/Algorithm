package Lv1._21_수박수박수박수박수박수;

public class Solution21 {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                answer.append('수');
            else
                answer.append('박');
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();

        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}
