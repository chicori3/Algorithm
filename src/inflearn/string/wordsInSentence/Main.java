package inflearn.string.wordsInSentence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        String answer = "";

        String[] strArr = str.split(" "); // 공백 기준으로 문자열 자르기

        for (String s : strArr) {
            if (answer.length() < s.length())
                answer = s;
        }
        return answer;
    }
}
