package BaekJoon.재귀.하노이_탑_이동_순서;

import java.util.Scanner;

public class Main { //11729번
    /*
	N : 원판의 개수
	start : 출발지
	mid : 옮기기 위해 이동해야 장소
	to : 목적지
	*/
    public static StringBuilder sb = new StringBuilder();

    public static void Hanoi(int N, int start, int mid, int to) {
        // 이동할 원반의 수가 1개일 때
        if (N == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        // A -> C로 옮긴다고 가정할 떄,
        // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        Hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        sb.append(start).append(" ").append(to).append("\n");

        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        Hanoi(N - 1, mid, start, to);

    }

    public static void Hanoi2(int N, int start, int to) {
        int mid = 6 - start - to;

        if (N == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        if (N >= 2) {
            Hanoi2(N - 1, start, mid);
            Hanoi2(1, start, to);
            Hanoi2(N - 1, mid, to);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        Hanoi2(N, 1, 3);

        System.out.println(sb);
    }
}
