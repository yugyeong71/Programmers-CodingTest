package org.example.Lv3;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Lv3. 야근 지수
 */
public class OverTimeIndex {
    public static void main(String[] args) {
        System.out.println(solution(4, new int[]{4, 3, 3}));
    }

    public static long solution(int n, int[] works) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works) {
            priorityQueue.offer(work);
        }

        for (int i = 0; i < n; i++) {
            if (priorityQueue.isEmpty()) {
                break;
            }

            int work = priorityQueue.poll();

            if (work == 0) break;
            else priorityQueue.offer(work - 1);
        }

        long answer = 0;

        while(!priorityQueue.isEmpty()){
            int value = priorityQueue.poll();
            answer += (long) value * value;
        }

        return answer;
    }
}
