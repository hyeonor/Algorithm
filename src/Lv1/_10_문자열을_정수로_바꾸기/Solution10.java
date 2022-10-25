package Lv1._10_문자열을_정수로_바꾸기;

public class Solution10 {

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();

        System.out.println(s.solution("1234"));
        System.out.println(s.solution("-1234"));
    }
}
