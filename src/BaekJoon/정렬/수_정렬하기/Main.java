package BaekJoon.정렬.수_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main { //2750번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}
