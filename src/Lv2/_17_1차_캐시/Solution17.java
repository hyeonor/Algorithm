package Lv2._17_1차_캐시;

import java.util.LinkedList;

public class Solution17 {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        if (cacheSize == 0)
            return cities.length * 5;

        for (String city : cities) {
            String s = city.toLowerCase();

            if (cache.remove(s)) {
                answer += 1;
                cache.add(s);
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.add(s);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution17 s = new Solution17();

        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        String[] cities5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
        String[] cities6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        System.out.println(s.solution(3, cities1));
        System.out.println(s.solution(3, cities2));
        System.out.println(s.solution(2, cities3));
        System.out.println(s.solution(5, cities4));
        System.out.println(s.solution(2, cities5));
        System.out.println(s.solution(0, cities6));
    }
}
