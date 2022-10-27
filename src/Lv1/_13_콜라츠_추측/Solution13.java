package Lv1._13_콜라츠_추측;

public class Solution13 {

    public int solution(int num) {
        long answer = num;
        int cnt = 0;

        while (answer != 1) {
            if (answer % 2 == 0) {
                answer = answer / 2;
            } else {
                answer = answer * 3 + 1;
            }
            cnt++;
        }

        if (cnt > 500)
            return -1;
        else
            return cnt;
    }

    public static void main(String[] args) {
        Solution13 s = new Solution13();

        System.out.println(s.solution(6));
        System.out.println(s.solution(16));
        System.out.println(s.solution(626331));
    }
}
