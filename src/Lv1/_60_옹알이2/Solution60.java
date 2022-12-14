package Lv1._60_옹알이2;

public class Solution60 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] doubleWords = {"ayaaya", "yeye", "woowoo", "mama"};

        for (int i = 0; i < babbling.length; i++) {
            for (int k = 0; k < 4; k++) {
                babbling[i] = babbling[i].replaceAll(doubleWords[k], "Y");
                babbling[i] = babbling[i].replaceAll(words[k], "X");
            }
        }

        for (String s : babbling) {
            if (s.replaceAll("X", "").isEmpty())
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution60 s = new Solution60();

        String[] babbling1 = {"aya", "yee", "u", "maa"};
        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] babbling3 = {"myea"};
        String[] babbling4 = {"wooyemawooye"};

        System.out.println(s.solution(babbling1));
        System.out.println(s.solution(babbling2));
        System.out.println(s.solution(babbling3));
        System.out.println(s.solution(babbling4));
    }
}
