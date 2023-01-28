package Lv2._38_땅따먹기;

public class Solution38 {

    int solution(int[][] land) {
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        for (int i = 0; i < land.length; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution38 s = new Solution38();

        int[][] land1 = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

        System.out.println(s.solution(land1));
    }
}
