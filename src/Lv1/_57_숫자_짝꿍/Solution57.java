package Lv1._57_숫자_짝꿍;

public class Solution57 {

    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] xCnt = new int[10];
        int[] yCnt = new int[10];

        for (int i = 0; i < X.length(); i++) {
            xCnt[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yCnt[Y.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xCnt[i], yCnt[i]);
            answer.append(String.valueOf(i).repeat(Math.max(0, min)));
        }

        if (answer.length() > 0) {
            if (answer.charAt(0) == '0')
                answer = new StringBuilder("0");
        } else {
            answer.append("-1");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution57 s = new Solution57();

        System.out.println(s.solution("100", "2345"));
        System.out.println(s.solution("100", "203045"));
        System.out.println(s.solution("100", "123450"));
        System.out.println(s.solution("12321", "42531"));
        System.out.println(s.solution("5525", "51255"));
    }
}
