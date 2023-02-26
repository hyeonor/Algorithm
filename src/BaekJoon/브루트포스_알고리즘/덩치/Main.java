package BaekJoon.브루트포스_알고리즘.덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static StringBuffer sb = new StringBuffer();

    static void frame() {
        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] && i != j) rank++;
            }
            sb.append(rank).append(" ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        frame();
        System.out.println(sb);
    }
}
