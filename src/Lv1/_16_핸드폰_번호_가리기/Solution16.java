package Lv1._16_핸드폰_번호_가리기;

public class Solution16 {

    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int n = phone_number.length();

        answer.append("*".repeat(Math.max(0, n - 4)));
        answer.append(phone_number, n - 4, n);

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution16 s = new Solution16();

        System.out.println(s.solution("01033334444"));
        System.out.println(s.solution("027778888"));
    }
}
