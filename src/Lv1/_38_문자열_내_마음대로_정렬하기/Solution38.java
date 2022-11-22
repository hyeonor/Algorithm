package Lv1._38_문자열_내_마음대로_정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution38 {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n + 1);
        }
        Arrays.sort(answer);

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).substring(n, n + 1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution38 s = new Solution38();

        String[] arr1 = {"sun", "bed", "car"};
        String[] arr2 = {"abce", "abcd", "cdx"};

        System.out.println(Arrays.toString(s.solution(arr1, 1)));
        System.out.println(Arrays.toString(s.solution(arr2, 2)));
    }
}
