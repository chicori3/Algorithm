import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(value -> value % n == 0)
                .boxed()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}