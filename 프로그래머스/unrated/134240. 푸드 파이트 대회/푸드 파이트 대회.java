class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i];
            count /= 2;
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        answer.append(sb).append(0).append(sb.reverse());

        return answer.toString();
    }
}