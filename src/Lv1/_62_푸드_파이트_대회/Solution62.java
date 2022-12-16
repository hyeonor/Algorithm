package Lv1._62_푸드_파이트_대회;

public class Solution62 {
    public String solution(int[] food) {
        StringBuilder half = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int k = 0; k < food[i] / 2; k++) {
                half.append(i);
            }
        }
        String before = half.toString();
        String reverse = half.reverse().toString();

        return before + "0" + reverse;
    }

    public static void main(String[] args) {
        Solution62 s = new Solution62();

        int[] food1 = {1, 3, 4, 6};
        int[] food2 = {1, 7, 1, 2};

        System.out.println(s.solution(food1));
        System.out.println(s.solution(food2));
    }
}
