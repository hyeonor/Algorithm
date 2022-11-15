package Lv1._32_이상한_문자_만들기;

public class Solution32 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");

        int cnt = 0;
        for (String value : arr) {
            if (value.equals(" ")) {
                answer.append(value);
                cnt = 0;
            } else if (cnt % 2 == 0) {
                answer.append(value.toUpperCase());
                cnt++;
            } else {
                answer.append(value.toLowerCase());
                cnt++;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution32 s = new Solution32();

        System.out.println(s.solution("try hello world"));
    }
}
