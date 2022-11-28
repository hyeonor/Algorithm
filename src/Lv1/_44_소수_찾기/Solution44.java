package Lv1._44_소수_찾기;

public class Solution44 {

    public int solution1(int n) {
        int answer = 0;
        int[] numbers = new int[n + 1];

        //2부터 n까지의 수를 배열에 넣는다.
        for (int i = 2; i <= n; i++)
            numbers[i] = i;

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for (int i = 2; i <= n; i++) {
            if (numbers[i] == 0) continue;

            for (int j = 2 * i; j <= n; j += i) {
                numbers[j] = 0;
            }
        }

        //배열에서 0이 아닌 것들의 개수
        for (int number : numbers)
            if (number != 0)
                answer++;

        return answer;
    }

    public int solution2(int n) { // 에라토스테네스의 체
        int answer = 0;
        int[] numbers = new int[n + 1];
        numbers[0] = numbers[1] = 0;

        for (int i = 2; i <= n; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (numbers[i] == 0) continue;
            for (int j = i + i; j <= n; j += i) {
                numbers[j] = 0;
            }
        }

        for (int number : numbers) {
            if (number != 0) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution44 s = new Solution44();

        System.out.println(s.solution1(10));
        System.out.println(s.solution1(5));
        System.out.println(s.solution2(10));
        System.out.println(s.solution2(5));
    }
}
