package Lv1._28_부족한_금액_계산하기;

public class Solution28 {

    public long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (long) i * price;
        }

        if (sum > money) return sum - money;
        else return 0;
    }

    public static void main(String[] args) {
        Solution28 s = new Solution28();

        System.out.println(s.solution(3, 20, 4));
    }
}
