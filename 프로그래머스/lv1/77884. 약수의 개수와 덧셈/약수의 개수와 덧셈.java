class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = getDivisorCount(i);
            answer += calculate(i, count);
        }

        return answer;
    }

    public int calculate(int num, int count) {
        return count % 2 == 0 ? num : -num;
    }

    public int getDivisorCount(int num) {
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i * i < num) {
                    count++;
                }
            }
        }

        return count;
    }
}