package Lv2._31_3차_압축;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution31 {

    public int[] solution(String msg) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String key = "";

        for (int i = 0; i < alphabet.length; i++) {
            hashMap.put(alphabet[i], i + 1);
        }

        while (!msg.equals("")) {
            if (msg.length() > 1) {
                // hashMap에 존재 하는 단어 중 가장 긴 단어 찾기
                for (int i = msg.length(); i >= 0; i--) {
                    if (hashMap.containsKey(msg.substring(0, i))) {
                        key = msg.substring(0, i);
                        break;
                    }
                }
                list.add(hashMap.get(key));

                int nextIndex = key.length() + 1;
                if (nextIndex < msg.length()) {
                    //w+c가 hashMap에 없을때 hashMap에 넣기
                    if (!hashMap.containsKey(msg.substring(0, nextIndex))) {
                        hashMap.put(msg.substring(0, nextIndex), hashMap.size() + 1);
                    }
                }
                msg = msg.substring(key.length());

            } else {
                list.add(hashMap.get(msg));
                msg = "";
            }
        }

        System.out.println(key);
        System.out.println(hashMap);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();

        System.out.println(Arrays.toString(s.solution("KAKAO")));
        System.out.println(Arrays.toString(s.solution("TOBEORNOTTOBEORTOBEORNOT")));
        System.out.println(Arrays.toString(s.solution("ABABABABABABABAB")));
    }
}
