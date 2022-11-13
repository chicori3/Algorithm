import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isNumeric(token)) {
                answer += Integer.parseInt(token);
                stack.push(Integer.parseInt(token));
            }
            if (token.equals("Z")) {
                answer -= stack.pop();
            }
        }

        return answer;
    }

    public boolean isNumeric(String token) {
        return token.matches("[+-]?\\d*(\\.\\d+)?");
    }
}