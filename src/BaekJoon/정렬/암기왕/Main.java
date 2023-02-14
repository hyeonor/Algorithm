package BaekJoon.정렬.암기왕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main { // 2776번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            HashSet<Integer> hashSet = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for(int k = 0; k < n; k++){
                hashSet.add(Integer.valueOf(st.nextToken()));
            }

            int m= Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            StringBuffer sb = new StringBuffer();

            for(int k = 0; k < m; k++){
                if(hashSet.contains(Integer.valueOf(st.nextToken())))
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }

            System.out.print(sb);
        }
    }
}
