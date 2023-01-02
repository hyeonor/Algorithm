package Lv2._12_구명보트;

import java.util.Arrays;

public class Solution12 {

    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();

        int[] people1 = {70, 50, 80, 50};
        int[] people2 = {70, 80, 50};

        System.out.println(s.solution(people1, 100));
        System.out.println(s.solution(people2, 100));
    }
}
