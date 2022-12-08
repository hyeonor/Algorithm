package Lv1._54_신규_아이디_추천;

public class Solution54 {

    public String solution1(String new_id) {
        String answer;

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]+", "");
        answer = answer.replaceAll("[.]+", ".");

        if (answer.charAt(0) == '.')
            answer = answer.substring(1);
        if (answer.length() != 0 && answer.charAt(answer.length() - 1) == '.')
            answer = answer.substring(0, answer.length() - 1);

        if (answer.isEmpty())
            answer = "a";
        if (answer.length() >= 16)
            answer = answer.substring(0, 15);
        if (answer.charAt(answer.length() - 1) == '.')
            answer = answer.substring(0, answer.length() - 1);

        if (answer.length() <= 2)
            for (int i = 0; i <= 3 - answer.length(); i++)
                answer += answer.charAt(answer.length() - 1);

        return answer;
    }

    public String solution2(String new_id) {
        StringBuilder answer;

        answer = new StringBuilder(new_id.toLowerCase());
        answer = new StringBuilder(answer.toString().replaceAll("[^a-z0-9-_.]+", ""));
        answer = new StringBuilder(answer.toString().replaceAll("[.]+", "."));

        if (answer.charAt(0) == '.')
            answer = new StringBuilder(answer.substring(1));
        if (answer.length() != 0 && answer.charAt(answer.length() - 1) == '.')
            answer = new StringBuilder(answer.substring(0, answer.length() - 1));

        if (answer.length() == 0)
            answer = new StringBuilder("a");
        if (answer.length() >= 16)
            answer = new StringBuilder(answer.substring(0, 15));
        if (answer.charAt(answer.length() - 1) == '.')
            answer = new StringBuilder(answer.substring(0, answer.length() - 1));

        if (answer.length() <= 2) {
            for (int i = 0; i <= 3 - answer.length(); i++)
                answer.append(answer.charAt(answer.length() - 1));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution54 s = new Solution54();

        String id1 = "...!@BaT#*..y.abcdefghijklm.";
        String id2 = "z-+.^.";
        String id3 = "=.=";
        String id4 = "123_.def";
        String id5 = "abcdefghijklmn.p";

        System.out.println(s.solution1(id1));
        System.out.println(s.solution1(id2));
        System.out.println(s.solution1(id3));
        System.out.println(s.solution1(id4));
        System.out.println(s.solution1(id5));

        System.out.println(s.solution2(id1));
        System.out.println(s.solution2(id2));
        System.out.println(s.solution2(id3));
        System.out.println(s.solution2(id4));
        System.out.println(s.solution2(id5));
    }
}
