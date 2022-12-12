class Solution {
    boolean solution(String s) {
        String lowerCaseString = s.toLowerCase();

        return countChar(lowerCaseString, "p") - countChar(lowerCaseString, "y") == 0;
    }

    int countChar(String str, String ch) {
        return str.length() - str.replace(ch, "").length();
    }
}