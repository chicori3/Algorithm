package inflearn.string.palindrome2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        // 대문자로 변환하고 정규식을 사용해서 알파벳 대문자가 아니면 빈 문자로 치환
        str = str.toUpperCase(Locale.ROOT)
                .replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();

        return str.equals(temp) ? "YES" : "NO";

    }

}
