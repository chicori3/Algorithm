package inflearn.string.password;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(solution(n, str));
    }

    public static String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();
        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            // 문자열을 7개씩 끊고 2진법으로 변환하여 얻은 아스키 코드를 문자로 변환
            chars[i] = (char) Integer.parseInt(str.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0'), 2);
            // 사용한 문자열 자르기
            str = str.substring(7);
        }

        for (char aChar : chars) {
            answer.append(aChar);
        }

        return answer.toString();
    }
}
