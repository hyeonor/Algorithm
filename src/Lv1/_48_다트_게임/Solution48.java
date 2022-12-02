package Lv1._48_다트_게임;

public class Solution48 {

    public int solution(String dartResult) {
        char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;

        for (int i = 0; i < darts.length; i++) {
            if (darts[i] >= '0' && darts[i] <= '9') {
                cnt++;
                if (darts[i] == '1' && darts[i + 1] == '0') {
                    score[cnt] = 10;
                    i++;
                } else {
                    score[cnt] = darts[i] - '0';
                }
            } else if (darts[i] == 'D') {
                score[cnt] *= score[cnt];
            } else if (darts[i] == 'T') {
                score[cnt] *= score[cnt] * score[cnt];
            } else if (darts[i] == '*') {
                if (cnt > 0) {
                    score[cnt - 1] *= 2;
                }
                score[cnt] *= 2;
            } else if (darts[i] == '#') {
                score[cnt] *= -1;
            }
        }
        return score[0] + score[1] + score[2];
    }

    public static void main(String[] args) {
        Solution48 s = new Solution48();

        System.out.println(s.solution("1S2D*3T"));
        System.out.println(s.solution("1D2S#10S"));
        System.out.println(s.solution("1D2S0T"));
        System.out.println(s.solution("1S*2T*3S"));
        System.out.println(s.solution("1D#2S*3S"));
        System.out.println(s.solution("1T2D3D#"));
        System.out.println(s.solution("1D2S3T*"));
    }
}
