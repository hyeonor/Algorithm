package BaekJoon.정렬.베스트셀러;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //1302번
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            map.put(s,map.getOrDefault(s,0) + 1);
        }

        sort();
    }

    private static void sort() {
        Integer maxValue = Collections.max(map.values());
        List<String> list = new ArrayList<>();

        for( String key : map.keySet() ){
            Integer value = map.get(key);
            if(Objects.equals(value, maxValue))
                list.add(key);
        }

        Collections.sort(list);

        System.out.println(list.get(0));
    }
}
