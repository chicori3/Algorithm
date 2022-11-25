import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.stream.Collectors;

class Solution {
    Deque<Integer> deque = new ArrayDeque<>();

    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : score) {
            deque.add(num);
            sort();
            if (deque.size() > k) {
                deque.pollFirst();
            }
            answer.add(deque.peekFirst());
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public void sort() {
        deque = deque.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayDeque::new));
    }
}