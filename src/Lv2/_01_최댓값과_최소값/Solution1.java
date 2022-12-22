package Lv2._01_최댓값과_최소값;

public class Solution1 {

    public String solution(String s) {
        int n;
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]), min = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            n = Integer.parseInt(arr[i]);
            if (max < n) max = n;
            if (min > n) min = n;
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        String s1 = "1 2 3 4";
        String s2 = "-1 -2 -3 -4";
        String s3 = "-1 -1";

        System.out.println(s.solution(s1));
        System.out.println(s.solution(s2));
        System.out.println(s.solution(s3));
    }
}
