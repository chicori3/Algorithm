import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int[] arr = Arrays.stream(people)
                .sorted()
                .toArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum > limit) {
                right--;
            } else {
                left++;
                right--;
            }
            answer++;
        }

        if (left == right) {
            answer++;
        }

        return answer;
    }
}