class Solution {
    public int[] sortedSquares(int[] nums) {
        
          int[] answer = Arrays.stream(nums)
                .map(operand -> operand * operand)
                .sorted()
                .toArray();


        return answer;
    }
}