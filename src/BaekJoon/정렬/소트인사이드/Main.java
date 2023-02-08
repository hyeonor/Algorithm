package BaekJoon.정렬.소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main { //1427번

    public static void sort(String s) {
        String[] arr1 = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr1[i] = s.substring(i, i + 1);
        }

        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(String.join("", arr1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String s = br.readLine();

        sort(s);
    }
}
