class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int result = 0;

        for (int i : nums) {
            if (i == 1) {
                cnt++;
                result = Math.max(result, cnt);
            } else {
                cnt = 0;
            }
        }
        
        return result;
    }
}