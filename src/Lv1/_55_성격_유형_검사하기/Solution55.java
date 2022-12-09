package Lv1._55_성격_유형_검사하기;

public class Solution55 {

    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        int[] ansArr = new int[8];

        for (int i = 0; i < survey.length; i++) {
            if (survey[i].charAt(0) == 'R' || survey[i].charAt(1) == 'T' ||
                survey[i].charAt(0) == 'T' || survey[i].charAt(1) == 'R') {
                if (survey[i].charAt(0) == 'R') {
                    check(choices, i, ansArr, 0, 1);
                } else {
                    check(choices, i, ansArr, 1, 0);
                }
            } else if (survey[i].charAt(0) == 'C' || survey[i].charAt(1) == 'F' ||
                       survey[i].charAt(0) == 'F' || survey[i].charAt(1) == 'C') {
                if (survey[i].charAt(0) == 'C') {
                    check(choices, i, ansArr, 2, 3);
                } else {
                    check(choices, i, ansArr, 3, 2);
                }
            } else if (survey[i].charAt(0) == 'J' || survey[i].charAt(1) == 'M' ||
                       survey[i].charAt(0) == 'M' || survey[i].charAt(1) == 'J') {
                if (survey[i].charAt(0) == 'J') {
                    check(choices, i, ansArr, 4, 5);
                } else {
                    check(choices, i, ansArr, 5, 4);
                }
            } else if (survey[i].charAt(0) == 'A' || survey[i].charAt(1) == 'N' ||
                    survey[i].charAt(0) == 'N' || survey[i].charAt(1) == 'A') {
                if (survey[i].charAt(0) == 'A') {
                    check(choices, i, ansArr, 6, 7);
                } else {
                    check(choices, i, ansArr, 7, 6);
                }
            }
        }

        answerCkeck(ansArr, 0, 1, answer, "R", "T");
        answerCkeck(ansArr, 2, 3, answer, "C", "F");
        answerCkeck(ansArr, 4, 5, answer, "J", "M");
        answerCkeck(ansArr, 6, 7, answer, "A", "N");

        return answer.toString();
    }

    private void answerCkeck(int[] ansArr, int n, int m, StringBuilder answer, String type1, String type2) {
        if (ansArr[n] != ansArr[m]) {
            if (ansArr[n] > ansArr[m]) answer.append(type1);
            else answer.append(type2);
        } else
            answer.append(type1);
    }

    private void check(int[] choices, int i, int[] ansArr, int n, int m) {
        if (choices[i] == 1) ansArr[n] += 3;
        else if (choices[i] == 2) ansArr[n] += 2;
        else if (choices[i] == 3) ansArr[n] += 1;
        else if (choices[i] == 5) ansArr[m] += 1;
        else if (choices[i] == 6) ansArr[m] += 2;
        else if (choices[i] == 7) ansArr[m] += 3;
    }

    public static void main(String[] args) {
        Solution55 s = new Solution55();

        String[] surveyArr = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choicesArr = {5, 3, 2, 7, 5};
        String[] surveyArr1 = {"TR", "RT", "TR"};
        int[] choicesArr1 = {7, 1, 3};

        System.out.println(s.solution(surveyArr1, choicesArr1));
    }
}
