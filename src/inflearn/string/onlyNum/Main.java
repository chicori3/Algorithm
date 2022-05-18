package inflearn.string.onlyNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static int solution(String str) {
        return Integer.parseInt(str.replaceAll("[a-zA-Z]", ""));
    }

    public static int solution2(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57)
                answer = answer * 10 + (c - 48);
        }
        return answer;
    }
}
