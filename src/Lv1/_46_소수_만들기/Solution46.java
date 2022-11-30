package Lv1._46_소수_만들기;

public class Solution46 {

    public int solution(int[] nums) {
        int answer = 0;
        int sum;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    //배열 중 3개 더하기
                    sum = nums[i] + nums[j] + nums[k];

                    //소수이면 +1
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int num) {
        //i=1부터가 아닌 이유는 1은 나눌 필요 없는 수이므로
        //나누어 떨어지면 소수가 아니므로 false
        if (num == 2)
            return true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        //나누어 떨어지지 않으면 true
        return true;
    }

    public static void main(String[] args) {
        Solution46 s = new Solution46();

        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {1, 2, 7, 6, 4};

        System.out.println(s.solution(arr));
    }
}
