package Lv2._35_피로도;

public class Solution35 {
    private int answer = 0;
    private boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];

        dfs(0, k, dungeons); //0은 depth, k 는 현재 피로도

        return answer;
    }

    private void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

    public static void main(String[] args) {
        Solution35 s = new Solution35();

        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(s.solution(80, dungeons));
    }
}
