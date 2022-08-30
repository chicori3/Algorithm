import java.util.Arrays;

class Solution {
     public int solution(int[] nums) {
        int num = nums.length / 2; // 고를 수 있는 폰켓몬의 수
        int answer = getAnswer(nums);

        // 선택할 수 있는 최댓값만 반환
        if (answer > num) {
            return num;
        }
        return answer;
    }

    private int getAnswer(int[] nums) {
        // 배열의 중복을 제거하고 남은 배열의 길이 반환
        return (int) Arrays.stream(nums)
                .distinct()
                .count();
    }
}