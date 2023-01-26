package Lv2._36_3차_n진수_게임;

public class Solution36 {

    public String solution1(int n, int t, int m, int p) {
        StringBuilder notation = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        //첫번째 시도 방법
        for (int i = 0; i < t * m; i++) {
            notation.append(Integer.toString(i, n));
        }

        for (int i = p - 1; i < notation.length(); i = i + m) {
            if(answer.length() == t) break;
            else answer.append(notation.charAt(i));
        }

        return answer.toString().toUpperCase();
    }

    public String solution2(int n, int t, int m, int p) {
        StringBuilder notation = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int index = 0;

        while (notation.length() <= t * m) {
            notation.append(Integer.toString(index++, n));
        }

        for (int i = p - 1; i < notation.length(); i = i + m) {
            if(answer.length() == t) break;
            else answer.append(notation.charAt(i));
        }

        return answer.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Solution36 s = new Solution36();

        System.out.println(s.solution1(2, 4, 2, 1));
        System.out.println(s.solution1(16, 16, 2, 1));
        System.out.println(s.solution1(16, 16, 2, 2));

        System.out.println(s.solution2(2, 4, 2, 1));
        System.out.println(s.solution2(16, 16, 2, 1));
        System.out.println(s.solution2(16, 16, 2, 2));
    }
}
