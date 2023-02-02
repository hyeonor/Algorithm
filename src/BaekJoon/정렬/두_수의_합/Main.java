package BaekJoon.정렬.두_수의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //3273번
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        sort1(n, x);
        sort2(n, x);
    }

    private static void sort1(int n, int x) {
        Collections.sort(list);

        int start = 0, end = n - 1, count = 0;
        while (start < end) {
            int sum = list.get(start) + list.get(end);
            if (sum == x) {
                count++;
            }

            if (sum <= x)
                start++;
            else
                end--;
        }

        System.out.println(count);
    }

    private static void sort2(int n, int x) {
        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            set.add(list.get(i));
        }

        for (int i = 0; i < n; i++) {
            if (set.contains(x - list.get(i)))
                count++;
        }

        System.out.println(count / 2);
    }
}
