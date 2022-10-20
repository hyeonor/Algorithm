package Lv1._5_정수_제곱근_판별;

public class Solution5 {

    public long solution(long n) {
        double x = Math.sqrt(n);

//        System.out.println((long) x + "    " + x);
        if ((long) x == x)
            return (long) Math.pow((x + 1), 2);
        else
            return -1;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();

        System.out.println(s.solution(121));
        System.out.println(s.solution(3));
    }
}
