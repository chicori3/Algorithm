import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();

        for (int[] command : commands) {
            int[] splicedArr = spliceArr(array, command);
            int[] sortedArr = sortArr(splicedArr);
            list.add(sortedArr[command[2] - 1]);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] spliceArr(int[] arr, int[] command) {
        return Arrays.copyOfRange(arr, command[0] - 1, command[1]);
    }

    public int[] sortArr(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}