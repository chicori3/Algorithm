import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int num : arr) {
            if (stack.peek() != num) {
                stack.push(num);
            }
        }

        return Arrays.stream(stack.toArray(new Integer[]{}))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}