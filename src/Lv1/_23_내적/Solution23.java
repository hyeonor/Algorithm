package Lv1._23_내적;

public class Solution23 {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution23 s = new Solution23();

        int[] aArr1 = {1, 2, 3, 4};
        int[] bArr1 = {-3, -1, 0, 2};
        int[] aArr2 = {-1, 0, 1};
        int[] bArr2 = {1, 0, -1};

        System.out.println(s.solution(aArr1, bArr1));
        System.out.println(s.solution(aArr2, bArr2));
    }
}
