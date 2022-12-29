package Lv2._09_카펫;

import java.util.Arrays;

public class Solution9 {
    public int[] solution(int brown, int yellow) {
        int n = (brown + 4) / 2;
        int width, length = n / 2;

        if (n % 2 == 0) width = n / 2;
        else width = n / 2 + 1;

        while (true) {
            if (width * length - brown == yellow) {
                return new int[]{width, length};
            } else {
                width++;
                length--;
            }
        }
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();

        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(24, 24)));
    }
}
