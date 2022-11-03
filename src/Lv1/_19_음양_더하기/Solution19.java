package Lv1._19_음양_더하기;

public class Solution19 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution19 s = new Solution19();

        int[] absolutesArr1 = {4, 7, 12};
        boolean[] signsArr1 = {true, false, true};
        int[] absolutesArr2 = {1, 2, 3};
        boolean[] signsArr2 = {false, false, true};

        System.out.println(s.solution(absolutesArr1, signsArr1));
        System.out.println(s.solution(absolutesArr2, signsArr2));
    }
}
