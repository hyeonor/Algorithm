package Lv1._12_나머지가_1이_되는_수_찾기;

public class Solution12 {

    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x < n; x++) {
            if (n % x == 1) {
                answer = x;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();

        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
    }
}
