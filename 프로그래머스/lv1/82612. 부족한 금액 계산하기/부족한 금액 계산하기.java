class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0L;

        for (int i = 1; i <= count; i++) {
            answer += (long) i * price;
        }

        return answer > money ? answer - money : 0;
    }
}