class Solution {
    public String longestCommonPrefix(String[] strs) {
        return commonPrefix(strs, 0, strs.length - 1);
    }
    
    String commonPrefix(String arr[], int low, int high) {
        if (low == high) {
            return arr[low];
        }
        
        if (high > low) {
            int mid = low + (high - low) / 2;
            
            String str1 = commonPrefix(arr, low, mid);
            String str2 = commonPrefix(arr, mid + 1, high);
            
            return commonPrefixUtil(str1, str2);
        }
        
        return null;
    }
    
    String commonPrefixUtil(String str1, String str2) {
        String result = "";
        int n1 = str1.length();
        int n2 = str2.length();
        
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            
            result += str1.charAt(i);
        }
        
        return result;
    }
}