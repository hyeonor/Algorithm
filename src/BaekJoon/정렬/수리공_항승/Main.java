package BaekJoon.정렬.수리공_항승;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //1449번
    static int[] positionArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        positionArr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            positionArr[i] = Integer.parseInt(st.nextToken());
        }

        sort(l);
    }

    private static void sort(int l) {
        Arrays.sort(positionArr);

        int count = 0, temp = 0;

        for (int position : positionArr) {
            if (position > temp) {
                temp = position + l - 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
