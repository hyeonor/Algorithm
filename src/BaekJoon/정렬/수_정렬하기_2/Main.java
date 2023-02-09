package BaekJoon.정렬.수_정렬하기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main { //2751번
    static int n;
    // static List<Integer> list = new LinkedList<>();
    // 정렬할때는 LinkedList말고 ArrayList 사용하기
    // LinkedList 사용하여 정렬하게 되는 시간초과 할 수 있다
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        sort(list);
    }

    private static void sort(ArrayList<Integer> list) {
        StringBuffer sb = new StringBuffer();
        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
