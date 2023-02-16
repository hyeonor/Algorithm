package BaekJoon.정렬.좌표_압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //18870번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<Integer> hashSet = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            hashSet.add(number);
            x[i] = number;
        }

        ArrayList<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!hashMap.containsKey(list.get(i)))
                hashMap.put(list.get(i), i);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(hashMap.get(x[i])).append(" ");
        }

        System.out.println(Arrays.toString(x));
        System.out.println(sb);
    }
}
