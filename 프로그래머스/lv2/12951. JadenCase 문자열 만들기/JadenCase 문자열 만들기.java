class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split("");
        boolean flag = true;

        for (String str : split) {
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ");
        }

        return answer;
    }
}