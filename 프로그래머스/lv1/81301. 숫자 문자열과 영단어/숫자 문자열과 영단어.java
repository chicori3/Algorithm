class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder keyword = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c - '0');
            } else {
                keyword.append(c);
            }
            if (keyword.length() >= 3) {
                int result = combine(keyword);
                if (result >= 0) {
                    answer.append(result);
                    keyword.delete(0, keyword.length());
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }

    int combine(StringBuilder keyword) {
        switch (keyword.toString()) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return -1;
        }
    }
}