class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        
        for (int num : nums) {
            low = Math.max(num, low);
            high += num;
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(mid, nums, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    public boolean canSplit(int targetSum, int[] nums, int k) {
        int count = 1;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            
            if (sum > targetSum) {
                count++;
                sum = num;
                
                if (count > k) {
                    return false;
                }
            }
        }
        
        return true;
    }
}