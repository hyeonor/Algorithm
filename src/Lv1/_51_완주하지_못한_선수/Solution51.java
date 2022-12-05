package Lv1._51_완주하지_못한_선수;

import java.util.Arrays;
import java.util.HashMap;

public class Solution51 {

    public String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[participant.length - 1];
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String player : participant) hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
        for (String player : completion) hashMap.put(player, hashMap.get(player) - 1);

        for (String s : participant) {
            if (hashMap.get(s) != 0)
                answer = s;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution51 s = new Solution51();

        String[] participantArr1 = {"leo", "kiki", "eden"};
        String[] completionArr1 = {"eden", "kiki"};

        String[] participantArr2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completionArr2 = {"josipa", "filipa", "marina", "nikola"};

        String[] participantArr3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completionArr3 = {"stanko", "ana", "mislav"};

        System.out.println(s.solution1(participantArr1, completionArr1));
        System.out.println(s.solution1(participantArr2, completionArr2));
        System.out.println(s.solution1(participantArr3, completionArr3));

        System.out.println(s.solution2(participantArr1, completionArr1));
        System.out.println(s.solution2(participantArr2, completionArr2));
        System.out.println(s.solution2(participantArr3, completionArr3));
    }
}
