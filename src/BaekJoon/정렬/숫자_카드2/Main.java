package BaekJoon.정렬.숫자_카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main { //10816번
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        String a;

        for (int i = 0; i < n; i++) {
            a = st.nextToken();
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer answer = new StringBuffer();
        String b;

        for (int i = 0; i < m; i++) {
            b = st.nextToken();
            if (hashMap.get(b) != null) answer.append(hashMap.get(b)).append(" ");
            else answer.append("0 ");
        }

        System.out.println(answer);
    }
}
