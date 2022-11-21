import java.util.*;

class Solution {
    static Map<Character, Integer> map = new HashMap<>();

    private static char getC(Character c1, Character c2) {
        return map.getOrDefault(c1, 0) >= map.getOrDefault(c2, 0) ? c1 : c2;
    }

    public String solution(String[] survey, int[] choices) {
        for (int i = 0; i < survey.length; i++) {
            int value = choices[i];

            if (value < 4) {
                char c = survey[i].charAt(0);
                map.put(c, map.getOrDefault(c, 0) + 4 - value);
                continue;
            }
            if (value > 4) {
                char c = survey[i].charAt(1);
                map.put(c, map.getOrDefault(c, 0) - 4 + value);
            }
        }

        return String.valueOf(getC('R', 'T')) +
                getC('C', 'F') +
                getC('J', 'M') +
                getC('A', 'N');
    }
}