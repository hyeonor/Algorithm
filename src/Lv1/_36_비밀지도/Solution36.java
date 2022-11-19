package Lv1._36_비밀지도;

import java.util.Arrays;

public class Solution36 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            String line1 = getBinary(n, arr1[i]);
            String line2 = getBinary(n, arr2[i]);

            for (int j = 0; j < n; j++) {
                if (line1.charAt(j) == '1' || line2.charAt(j) == '1')
                    str.append("#");
                else
                    str.append(" ");
            }
            answer[i] = str.toString();
        }
        return answer;
    }

    private String getBinary(int n, int num) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(num));
        int len = binary.length();

        for (int i = 0; i < n - len; i++)
            binary.insert(0, "0");

        return binary.toString();
    }

    public static void main(String[] args) {
        Solution36 s = new Solution36();

        int[] a1 = {9, 20, 28, 18, 11};
        int[] b1 = {30, 1, 21, 17, 28};
        int[] a2 = {46, 33, 33, 22, 31, 50};
        int[] b2 = {27, 56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(s.solution(5, a1, b1)));
        System.out.println(Arrays.toString(s.solution(6, a2, b2)));
    }
}
