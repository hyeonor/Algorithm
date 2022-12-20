package Lv1._66_문자열_나누기;

public class Solution66 {

    public int solution1(String s) {
        int answer = 0;

        Character x = s.charAt(0);
        int xCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (x.equals(s.charAt(i))) xCnt++;
            else yCnt++;

            if (xCnt == yCnt) {
                s = s.substring(i + 1);

                if (s.length() > 1) {
                    answer++;
                    xCnt = 0;
                    yCnt = 0;
                    i = -1;
                    x = s.charAt(0);
                } else answer++;
            }
        }

        if (!s.isEmpty()) return answer + 1;
        else return answer;
    }

    public int solution2(String s) {
        int answer = 0;

        Character x = s.charAt(0);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (x.equals(s.charAt(i))) count++;
            else count--;

            if (count == 0) {
                s = s.substring(i + 1);

                if (s.length() > 1) {
                    i = -1;
                    answer++;
                    x = s.charAt(0);
                } else answer++;
            }
        }

        if (!s.isEmpty()) return answer + 1;
        else return answer;
    }

    public int solution3(String s) {
        Character x = s.charAt(0);
        int answer = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (x.equals(s.charAt(i))) count++;
            else count--;

            if (count == 0) {
                if (i + 1 < s.length()) {
                    answer++;
                    x = s.charAt(i + 1);
                } else answer++;
            }
        }

        if (count == 0) return answer;
        else return answer + 1;
    }

    public static void main(String[] args) {
        Solution66 s = new Solution66();

        System.out.println(s.solution1("banana"));
        System.out.println(s.solution1("abracadabra"));
        System.out.println(s.solution1("aaabbaccccabba"));

        System.out.println(s.solution2("banana"));
        System.out.println(s.solution2("abracadabra"));
        System.out.println(s.solution2("aaabbaccccabba"));

        System.out.println(s.solution3("banana"));
        System.out.println(s.solution3("abracadabra"));
        System.out.println(s.solution3("aaabbaccccabba"));
    }
}
