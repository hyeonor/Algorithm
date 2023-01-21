package Lv2._32_더_맵게;

import java.util.PriorityQueue;

public class Solution32 {

    public int solution(int[] scoville, int K) {
        int answer = 0, sum;
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        for (int element : scoville) {
            priorityQueueLowest.add(element);
        }

        while (priorityQueueLowest.size() >= 2) {
            sum = priorityQueueLowest.poll() + (priorityQueueLowest.poll() * 2);
            priorityQueueLowest.add(sum);
            answer++;

            if (priorityQueueLowest.peek() >= K) break;
        }

        if (K > priorityQueueLowest.peek()) return -1;

        return answer;
    }

    public static void main(String[] args) {
        Solution32 s = new Solution32();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int[] scoville1 = {0, 0, 5, 5, 5};

        System.out.println(s.solution(scoville, 7)); // 2
        System.out.println(s.solution(scoville1, 2)); // 2
    }
}
