import java.util.*;
class Solution {
    public static int[] solution(String s) {
        String[] arr = s.replaceAll("[{}]", " ").trim().split(" ,");
        int[] answer = new int[arr.length];

        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(arr, (a, b) -> (a.length() - b.length()));
        int i = 0;
        for (String str : arr) {
            for (String st : str.split(",")) {
                int a = Integer.parseInt(st.trim());
                if (hs.contains(a)) {
                    continue;
                }
                hs.add(a);
                answer[i++] = a;
            }
        }

        return answer;
    }
}