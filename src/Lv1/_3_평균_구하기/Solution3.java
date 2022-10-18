package Lv1._3_평균_구하기;

public class Solution3 {

    public double solution(int[] arr) {
        double answer, sum = 0;

        for (double n : arr)
            sum += n;

        answer = sum / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 5};

        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
    }
}
