package BaekJoon.정렬.접미사_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main { //11656번
    public void solution(String words) {
        String[] arr = new String[words.length()];

        arr[0] = words;
        for (int i = words.length() - 1; i > 0; i--) {
            arr[words.length() - i] = words.substring(i);
        }

        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length(); i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }

    public void solution1(String words) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add(words);
        for (int i = words.length() - 1; i > 0; i--) {
            pq.add(words.substring(i));
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length(); i++) {
            sb.append(pq.poll()).append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();

        Main main = new Main();

        main.solution(words);
        main.solution1(words);
    }
}
