package BaekJoon.정렬.커트라인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int grade = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());

        cutLine(st, list, n, grade);
    }

    private static void cutLine(StringTokenizer st, ArrayList<Integer> list, int n, int grade) {
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        list.sort(Collections.reverseOrder());

        System.out.println(list.get(grade));
    }
}
