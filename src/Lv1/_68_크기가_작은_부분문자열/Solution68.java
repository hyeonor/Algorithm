package Lv1._68_크기가_작은_부분문자열;

public class Solution68 {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long num = Long.parseLong(t.substring(i, i + p.length()).replaceFirst("^0+(?!$)", ""));
            if (num <= pNum) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution68 s = new Solution68();

        System.out.println(s.solution("3141592", "271"));
        System.out.println(s.solution("500220839878", "7"));
        System.out.println(s.solution("10203", "15"));
    }
}
