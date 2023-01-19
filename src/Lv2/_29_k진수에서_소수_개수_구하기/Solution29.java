package Lv2._29_k진수에서_소수_개수_구하기;

public class Solution29 {

    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        String[] arr = str.split("0");

        for (String s : arr) {
            if (!s.isEmpty()) {
                if (isPrime(Long.parseLong(s))) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(long num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution29 s = new Solution29();

        System.out.println(s.solution(437674, 3));
        System.out.println(s.solution(110011, 10));
    }
}
