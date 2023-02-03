package BaekJoon.정렬.듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //1764번
    static HashSet<String> hashSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            hashSet.add(s);
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(hashSet.contains(s)) {
                if(i == m -1)
                    list.add(s);
                else
                    list.add(s);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (String s : list) System.out.println(s);
    }
}
