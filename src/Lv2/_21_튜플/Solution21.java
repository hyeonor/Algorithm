package Lv2._21_튜플;

import java.util.*;

public class Solution21 {

    public int[] solution(String s) {
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Map<Integer,String> map =new HashMap<>();

        if(arr.length == 1) return new int[]{Integer.parseInt(arr[0])};
        else {
            for (String item : arr) map.put(item.length(), item);

            List<Integer> keySet = new ArrayList<>(map.keySet());
            // 키 값으로 오름차순 정렬
            Collections.sort(keySet);

            int[] answer = new int[map.size()];

            for (int i = 0; i < map.size(); i++) {
                if (i == 0)
                    answer[i] = Integer.parseInt(map.get(keySet.get(i)));
                else {
                    TreeSet<Integer> A = new TreeSet<>();
                    String[] arrList = map.get(keySet.get(i)).split(",");

                    for (String value : arrList)
                        A.add(Integer.valueOf(value));

                    for (int j = 0; j < arrList.length; j++) {
                        //A에 포함된 요소면 삭제
                        A.remove(answer[j]);
                    }
                    answer[i] = A.first();
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();

        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(s.solution("{{123}}")));
        System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}
