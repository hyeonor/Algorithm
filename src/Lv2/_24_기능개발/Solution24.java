package Lv2._24_기능개발;

import java.util.*;

public class Solution24 {

    public int[] solution1(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int[] day = new int[progresses.length];

        for(int i = 0 ; i < progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0)
                day[i] = (100 - progresses[i]) / speeds[i];
            else
                day[i] = (100 - progresses[i]) / speeds[i] + 1;
        }

        int max = day[0], ansCnt = 1;

        for(int i = 1 ; i < progresses.length; i++){
            if(max < day[i]) {
                max = day[i];
                list.add(ansCnt);
                ansCnt = 1;
            }
            else
                ansCnt++;
        }
        list.add(ansCnt);

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public int[] solution2(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] day = new int[progresses.length];

        for(int i = 0 ; i < progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0)
                day[i] = (100 - progresses[i]) / speeds[i];
            else
                day[i] = (100 - progresses[i]) / speeds[i] + 1;
        }

        queue.offer(day[0]);
        for(int i = 1 ; i < progresses.length; i++){
            if(queue.peek() >= day[i]) {
                queue.offer(day[i]);
            }
            else {
                list.add(queue.size());
                queue.clear();
                queue.offer(day[i]);
            }
        }
        list.add(queue.size());

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        Solution24 s = new Solution24();

        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(s.solution1(progresses1, speeds1)));
        System.out.println(Arrays.toString(s.solution1(progresses2, speeds2)));

        System.out.println(Arrays.toString(s.solution2(progresses1, speeds1)));
        System.out.println(Arrays.toString(s.solution2(progresses2, speeds2)));
    }
}
