package Lv2._27_전화번호_목록;

import java.util.*;

public class Solution27 {

    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);

        // 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (String phone : phone_book)
            for (int j = 0; j < phone.length(); j++) {
                //phone.substring(0, j)이라는 Key가 현재 HashMap에 존재하는지 확인하는 함수
                if (map.containsKey(phone.substring(0, j)))
                    return false;
            }

        return true;
    }

    public static void main(String[] args) {
        Solution27 s = new Solution27();

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};
        String[] phone_book4 = {"934793", "34", "44", "9347"};

        System.out.println(s.solution(phone_book1)); // false
        System.out.println(s.solution(phone_book2)); // true
        System.out.println(s.solution(phone_book3)); // false
        System.out.println(s.solution(phone_book4)); // false
    }
}
