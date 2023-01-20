package Lv2._30_주차_요금_계산;

import java.util.*;

public class Solution30 {

    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> mapCnt = new HashMap<>();

        // 주차 시간 계산
        for (String record : records) {
            int time = Integer.parseInt(record.substring(0, 2)) * 60 + Integer.parseInt(record.substring(3, 5));
            String key = record.substring(6, 10);

            mapCnt.put(key, mapCnt.getOrDefault(key, 0) + 1);

            if (!parking.containsKey(key)) parking.put(key, -time);
            else {
                int timeTemp = parking.get(key);
                if (mapCnt.get(key) % 2 != 0) parking.put(key, timeTemp - time);
                else parking.put(key, timeTemp + time);
            }
        }

        String[] keyValue = mapCnt.keySet().toArray(new String[0]);
        int parkingDuration;

        // 주차 요금 계산
        for (int i = 0; i < mapCnt.size(); i++) {
            if (mapCnt.get(keyValue[i]) % 2 != 0) {
                parkingDuration = 1439 + parking.get(keyValue[i]) - fees[0];
                parkingPrice(fees, parking, keyValue, parkingDuration, i);
            } else {
                parkingDuration = parking.get(keyValue[i]) - fees[0];
                parkingPrice(fees, parking, keyValue, parkingDuration, i);
            }
        }

        int[] answer = new int[parking.size()];
        List<String> keys = new ArrayList<>(parking.keySet());
        Collections.sort(keys);

        for (int i = 0; i < keys.size(); i++)
            answer[i] = parking.get(keys.get(i));

        return answer;
    }

    private void parkingPrice(int[] fees, Map<String, Integer> parking, String[] keyValue, int parkingDuration, int i) {
        int price;

        //기본 시간보다 작을때 기본 요금으로 청구
       if (parkingDuration < 0) parking.put(keyValue[i], fees[1]);
        else {
            price = fees[1] + (int) Math.ceil((double) (parkingDuration) / fees[2]) * fees[3];
            parking.put(keyValue[i], price);
        }
    }

    public static void main(String[] args) {
        Solution30 s = new Solution30();

        int[] fees1 = {180, 5000, 10, 600};
        int[] fees2 = {120, 0, 60, 591};
        int[] fees3 = {1, 461, 1, 10};

        String[] records1 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT",
                "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        String[] records2 = {"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"};
        String[] records3 = {"00:00 1234 IN"};

        System.out.println(Arrays.toString(s.solution(fees1, records1)));
        System.out.println(Arrays.toString(s.solution(fees2, records2)));
        System.out.println(Arrays.toString(s.solution(fees3, records3)));
    }
}
