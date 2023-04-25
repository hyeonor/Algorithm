package BaekJoon.알고리즘_기초2.브루트_포스.날짜_계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 1476번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] year = new int[3];

        year[0] = Integer.parseInt(st.nextToken());
        year[1] = Integer.parseInt(st.nextToken());
        year[2] = Integer.parseInt(st.nextToken());

        int E = 1, S = 1, M = 1, cnt = 1;

        while (year[0] != E || year[1] != S || year[2] != M) {
            cnt++;
            E++;
            S++;
            M++;

            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;
        }

        System.out.println(cnt);
    }
}
