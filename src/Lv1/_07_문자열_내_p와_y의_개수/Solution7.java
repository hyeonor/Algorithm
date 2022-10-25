package Lv1._07_문자열_내_p와_y의_개수;

public class Solution7 {

    boolean solution(String s) {
        int pcnt = 0, ycnt = 0;

        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            if (sub.equals("p") || sub.equals("P"))
                pcnt++;
            else if (sub.equals("y") || sub.equals("Y"))
                ycnt++;
        }

        return pcnt == ycnt;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();

        String str = "pPoooyY";
        String str1 = "Pyy";

        System.out.println(s.solution(str));
        System.out.println(s.solution(str1));
    }
}
