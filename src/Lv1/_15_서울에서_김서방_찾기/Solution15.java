package Lv1._15_서울에서_김서방_찾기;

public class Solution15 {

    public String solution(String[] seoul) {

        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                answer = "김서방은 " + i + "에 있다";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();

        String[] arr = {"Jane", "Kim"};

        System.out.println(s.solution(arr));
    }
}
