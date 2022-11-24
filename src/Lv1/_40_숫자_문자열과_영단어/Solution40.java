package Lv1._40_숫자_문자열과_영단어;

public class Solution40 {

    public int solution(String s) {
        String[] num_en = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < num_en.length; i++){
            // replace 특정문자를 찾아서 특정문자로 변경
            s = s.replace(num_en[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution40 s = new  Solution40();

        System.out.println(s.solution("one4seveneight"));
        System.out.println(s.solution("23four5six7"));
        System.out.println(s.solution("2three45sixseven"));
        System.out.println(s.solution("123"));
    }
}
