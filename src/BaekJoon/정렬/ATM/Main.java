package BaekJoon.정렬.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main { //11399번
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public static void atm() {
        int sum = 0;

        while (!priorityQueue.isEmpty()) {
            sum += priorityQueue.size() * priorityQueue.poll();
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            priorityQueue.add(Integer.parseInt(st.nextToken()));
        }

        atm();
    }
}
