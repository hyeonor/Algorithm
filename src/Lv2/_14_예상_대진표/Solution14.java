package Lv2._14_예상_대진표;

public class Solution14 {

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();

        System.out.println(s.solution(8, 4, 7));
    }
}
/*
참가자의 번호가 짝수인 경우 참가자 번호 / 2 가 참가자의 라운드 번호가 되고
참가자의 번호가 홀수인 경우 참가자 번호 / 2 + 1이 참가자의 라운드 번호가 된다

라운드의 번호는 해당 라운드가 끝난 후 승자의 새 참가자 번호가 되기 때문에
위의 과정을 반복하여 a와 b가 한 라운드에 들어 있는 경우를 찾아내면 된다
*/