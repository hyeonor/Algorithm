package Lv2._18_H_Index;

import java.util.Arrays;

public class Solution18 {

    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int H_Index = citations.length - i;
            if (citations[i] >= H_Index)
                return H_Index;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution18 s = new Solution18();

        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(s.solution(citations));
    }
}
