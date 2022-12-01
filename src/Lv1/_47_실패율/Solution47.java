package Lv1._47_실패율;

import java.util.Arrays;

public class Solution47 {

    public int[] solution(int N, int[] stages) {
        int[] stagesAnswer = new int[N + 1];
        double[] aveAnswer = new double[N];
        int stagesLength = stages.length;

        for (int i = 1; i <= N; i++) {
            for (int stage : stages) {
                if (stage == i)
                    stagesAnswer[i]++;
            }
        }

        for (int i = 0; i < N; i++) {
            stagesLength = stagesLength - stagesAnswer[i];
            aveAnswer[i] = stagesAnswer[i + 1] / (double) stagesLength;
        }
        return sort(aveAnswer);
    }

    public int[] sort(double[] arr) {
        int[] sortNum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortNum[i] = i + 1;
        }

        int tempNum;
        for (int i = 1; i < arr.length; i++) {
            double tempArr = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (tempArr > arr[j]) {
                    tempNum = sortNum[j];
                    sortNum[j] = sortNum[j + 1];
                    sortNum[j + 1] = tempNum;
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = tempArr;
        }
        return sortNum;
    }

    public static void main(String[] args) {
        Solution47 s = new Solution47();

        int[] arr1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] arr2 = {4, 4, 4, 4, 4};

        System.out.println(Arrays.toString(s.solution(5, arr1)));
        System.out.println(Arrays.toString(s.solution(4, arr2)));
    }
}
