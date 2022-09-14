class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int x = 0;
        int y = 0;

        for (int i = 1; i < yellow + 1; i++) {
            if (yellow % i == 0) {
                x = yellow / i;
                y = i;

                if (x * 2 + y * 2 + 4 == brown) {
                    x += 2;
                    y += 2;
                    return new int[]{Math.max(x, y), Math.min(x, y)};
                }
            }
        }

        return answer;
    }
}