package BaekJoon.정렬.세_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main { //10817번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        int count = st.countTokens();

        for (int i = 0; i < count; i++) {
            priorityQueue.offer(Integer.valueOf(st.nextToken()));
        }

        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
    }
}