class Solution {
    public int solution(int[] common) {
        int length = common.length;
        int a = common[0];
        int b = common[1];
        int c = common[2];
        
        if(b - a == c - b) {
            return common[length - 1] + b - a;
        }
        return common[length - 1] * b / a;
        
    }
}