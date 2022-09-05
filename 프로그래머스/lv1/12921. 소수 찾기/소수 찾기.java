class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 2 * i; j < arr.length; j += i) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
}