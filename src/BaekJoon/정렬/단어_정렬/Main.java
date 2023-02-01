package BaekJoon.정렬.단어_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //1181번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr, (s1, s2) -> {
            // 단어 길이가 같을 경우
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            // 그 외의 경우
            else {
                return s1.length() - s2.length();
            }
        });

        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1]))
                System.out.println(arr[i]);
        }
    }
}
