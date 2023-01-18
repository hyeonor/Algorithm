package Lv2._28_타겟_넘버;

public class Solution28 {
    int[] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    void dfs(int index, int sum) {
        // 1. 탈출 조건
        if(index == numbers.length) {
            if(sum == target) answer++;
            return;
        }

        // 2. 수행 조건
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }

    public static void main(String[] args) {
        Solution28 s = new Solution28();

        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};

        System.out.println(s.solution(numbers1, 3));
        System.out.println(s.solution(numbers2, 4));
    }
}
