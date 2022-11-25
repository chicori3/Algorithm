import java.util.*;

class Solution {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : score) {
            queue.add(num);

            if (queue.size() > k) {
                queue.poll();
            }
            answer.add(queue.peek());
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}