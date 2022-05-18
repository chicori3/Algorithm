package inflearn.string.shortestDistance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i : solution(str)) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(String str) {
        String[] s = str.split(" ");

        int[] answer = new int[s[0].length()];
        int p = 1000;
        for (int i = 0; i < s[0].length(); i++) {
            answer[i] = ++p;
            if (s[0].charAt(i) == s[1].charAt(0)) {
                p = 0;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = s[0].length() - 1; i >= 0; i--) {
            answer[i] = Math.min(answer[i], ++p);
            if (s[0].charAt(i) == s[1].charAt(0)) {
                p = 0;
                answer[i] = Math.min(answer[i], p);
            }
        }


        return answer;
    }
}
