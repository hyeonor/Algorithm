package Lv1._20_없는_숫자_더하기;

public class Solution20 {

    public int solution(int[] numbers) {
        int answer = 45;

        for (int n : numbers)
            answer -= n;

        return answer;
    }

    public static void main(String[] args) {
        Solution20 s = new Solution20();

        int[] numbersArr1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbersArr2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(s.solution(numbersArr1));
        System.out.println(s.solution(numbersArr2));
    }
}
