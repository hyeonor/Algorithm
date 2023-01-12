package Lv2._22_위장;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Solution22 {

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 1) + 1);
            System.out.println(map);
        }
        System.out.println(map.values());
        Collection<Integer> test = map.values();

        return test.stream().reduce(1, (a, b) -> a * b) - 1;
    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(s.solution(clothes1));
        System.out.println(s.solution(clothes2));
    }
}
