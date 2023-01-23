package Lv2._33_오픈채팅방;

import java.util.Arrays;
import java.util.HashMap;

public class Solution33 {

    public String[] solution(String[] record) {
        int cnt = 0;
        HashMap<String, String> map = new HashMap<>();

        for (String value : record) {
            if (value.split(" ")[0].equals("Enter")) {
                map.put(value.split(" ")[1], value.split(" ")[2]);
                cnt++;
            } else if (value.split(" ")[0].equals("Change")) {
                map.put(value.split(" ")[1], value.split(" ")[2]);
            } else cnt++;

        }

        String[] answer = new String[cnt];
        int index = 0;

        for (String s : record) {
            if (s.split(" ")[0].equals("Enter"))
                answer[index++] = map.get(s.split(" ")[1]) + "님이 들어왔습니다.";
            else if (s.split(" ")[0].equals("Leave"))
                answer[index++] = map.get(s.split(" ")[1]) + "님이 나갔습니다.";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution33 s = new Solution33();

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(s.solution(record)));
    }

}
