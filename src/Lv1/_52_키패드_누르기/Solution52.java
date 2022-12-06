package Lv1._52_키패드_누르기;

public class Solution52 {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int lhand = 10, rhand = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                lhand = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rhand = number;
            } else {
                if (number == 0)
                    number = 11;

                int leftDist = Math.abs(number - lhand) / 3 + Math.abs(number - lhand) % 3;
                int rightDist = Math.abs(number - rhand) / 3 + Math.abs(number - rhand) % 3;

                if (leftDist < rightDist) {
                    answer.append("L");
                    lhand = number;
                } else if (leftDist > rightDist) {
                    answer.append("R");
                    rhand = number;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        lhand = number;
                    } else {
                        answer.append("R");
                        rhand = number;
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution52 s = new Solution52();

        int[] numberArr1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numberArr2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] numberArr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(s.solution(numberArr1, "right"));
        System.out.println(s.solution(numberArr2, "left"));
        System.out.println(s.solution(numberArr3, "right"));
    }
}
