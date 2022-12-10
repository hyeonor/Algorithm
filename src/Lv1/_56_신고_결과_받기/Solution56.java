package Lv1._56_신고_결과_받기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution56 {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // 메일을 받은 횟수
        HashMap<String, Integer> idMap = new HashMap<>(); // 유저 순서저장
        HashMap<String, HashSet<String>> map = new HashMap<>(); // 각 유저별 자신을 신고한 유저 set

        // 초기값
        for (int i = 0; i < id_list.length; i++) {
            idMap.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }

        // 자신을 신고한 유저이름 저장
        for (String r : report) {
            String[] str = r.split(" ");
            map.get(str[1]).add(str[0]);
        }

        // 유저별 신고당한 횟수가 k보다 많으면 메일보냄
        for (String s : id_list) {
            HashSet<String> set = map.get(s); // 해당 유저를 신고한 유저 set
            if (set.size() >= k) {
                for (String userId : set) {
                    // userId가 동일한 순서 answer증가
                    answer[idMap.get(userId)]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution56 s = new Solution56();

        String[] idList1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        String[] idList2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};

        System.out.println(Arrays.toString(s.solution(idList1, report1, 2)));
        System.out.println(Arrays.toString(s.solution(idList2, report2, 3)));
    }
}
