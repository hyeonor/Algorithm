package Lv2._08_다음_큰_숫자;

public class Solution8 {

    public int solution(int n) {
        int count = binary(n), index = 1;

        while (true) {
            int number = n + index++;
            if (count == binary(number)) {
                return number;
            }
        }
    }

    public int binary(int x) {
        String str = Integer.toBinaryString(x);
        int count = 0;
        char[] strArr = str.toCharArray();

        for (char val : strArr) {
            if (val == '1') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();

        System.out.println(s.solution(78));
        System.out.println(s.solution(15));
    }
}
