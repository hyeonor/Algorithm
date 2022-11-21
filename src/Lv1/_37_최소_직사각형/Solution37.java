package Lv1._37_최소_직사각형;

public class Solution37 {

    public int solution(int[][] sizes) {
        int answer;
        int temp, x = 0, y = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if (x < sizes[i][0])
                x = sizes[i][0];

            if (y < sizes[i][1])
                y = sizes[i][1];
        }
        answer = x * y;

        return answer;
    }

    public static void main(String[] args) {
        Solution37 s = new Solution37();
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] arr1 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] arr2 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(s.solution(arr));
        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
    }
}
