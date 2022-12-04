package Lv1._50_체육복;

public class Solution50 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = 0;
                    answer++;
                }
            }
        }

        for (int l : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if ((l == reserve[j] - 1 || l == reserve[j] + 1) && reserve[j] != 0) {
                    reserve[j] = 0;
                    answer++;
                }
            }
        }
        return Math.min(answer, n);
    }

    public static void main(String[] args) {
        Solution50 s = new Solution50();

        int[] lostArr1 = {2, 4};
        int[] reserveArr1 = {1, 3, 5};
        int[] lostArr2 = {2, 4};
        int[] reserveArr2 = {3};
        int[] lostArr3 = {3};
        int[] reserveArr3 = {1};

        System.out.println(s.solution(5, lostArr1, reserveArr1));
        System.out.println(s.solution(5, lostArr2, reserveArr2));
        System.out.println(s.solution(3, lostArr3, reserveArr3));
    }
}
