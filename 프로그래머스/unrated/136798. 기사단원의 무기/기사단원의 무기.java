class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = getDivisorCount(i);
            answer += divisorCount <= limit ? divisorCount : power;
        }

        return answer;
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