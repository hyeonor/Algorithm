package BaekJoon.알고리즘_기초1.자료구조1.요세푸스_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 1158번
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        System.out.println(getJosephus(k));
    }

    private static StringBuffer getJosephus(int k) {
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        while (queue.size() != 1) {
            for (int j = 0; j < k - 1; j++)
                queue.add(queue.poll());
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");

        return sb;
    }
}
