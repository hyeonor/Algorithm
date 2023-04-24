package BaekJoon.알고리즘_기초2.브루트_포스.리모컨;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            set.add(st.nextToken());
        }

        int channel = 100;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if (!set.contains(n.substring(i, i + 1)))
                sb.append(n.charAt(i));
//                System.out.println(n.substring(i, i + 1));
            else {
                int k = Integer.parseInt(n.substring(i, i + 1));
//                System.out.println(set.contains(String.valueOf(k--)));
//                System.out.println(set.contains(String.valueOf(k--)));
//                System.out.println(set.contains(String.valueOf(k--)));
//                System.out.println("k " + k);
                while (set.contains(String.valueOf(k)) && k != 0)
                    k--;
                sb.append(k);
//                System.out.println(k);
            }
            channel++;
        }

        int cnt = n.length();
        int sbInt = Integer.parseInt(sb.toString());
        System.out.println(sbInt);
        while (Integer.parseInt(n) > sbInt) {
            sbInt++;
            cnt++;
        }
//        System.out.println(Integer.parseInt(sb.toString()));
        System.out.println(cnt);
    }
}
