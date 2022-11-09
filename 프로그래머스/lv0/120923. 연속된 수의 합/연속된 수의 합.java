import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = num * (num + 1) / 2;
        int offset = (total - sum) / num;

        for (int i = 1; i <= num; i++) {
            answer.add(i + offset);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}