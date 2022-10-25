package Lv1._01_짝수와_홀수;

public class Solution1 {

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}
