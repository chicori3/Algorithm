package inflearn.string.caseChange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(main.solution(s));
    }

    public String solution(String str) {
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                // 문자가 대문자면 소문자로 변환
                result += Character.toLowerCase(c);
            else
                // 소문자면 대문자로 변환
                result += Character.toUpperCase(c);
        }

        return result;
    }
}