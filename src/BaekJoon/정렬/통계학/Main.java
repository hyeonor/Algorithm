package BaekJoon.정렬.통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //2108번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine()), sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);

        int mode = getMode(map);

        String answer = Math.round((float) sum / n) + "\n" +
                arr[n / 2] + "\n" +
                mode + "\n" +
                (arr[n - 1] - arr[0]);

        System.out.println(answer);
    }

    private static int getMode(Map<Integer, Integer> map) {
        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        listKeySet.sort((value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        List<Integer> listKey = new ArrayList<>();

        int i;
        for (i = 0; i < listKeySet.size() - 1; i++) {
            if (Objects.equals(map.get(listKeySet.get(i)), map.get(listKeySet.get(i + 1)))) {
                listKey.add(listKeySet.get(i));
            } else break;
        }

        if (i == listKey.size())
            listKey.add(listKeySet.get(i));

        Collections.sort(listKey);

        int mode;
        if (listKey.size() > 1)
            mode = listKey.get(1);
        else
            mode = listKey.get(0);

        return mode;
    }
}

