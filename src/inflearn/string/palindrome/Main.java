package inflearn.string.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase(Locale.ROOT);

        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            // lt와 rt가 일치하지 않으면 NO
            if (chars[lt] != chars[rt]) {
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }
        return "YES";
    }

    public String solution2(String str) {
        String temp = new StringBuilder(str).reverse().toString();

        // StringBuilder로 문자열을 뒤집어서 검사
        if (str.equalsIgnoreCase(temp)) {
            return "YES";
        }

        return "NO";
    }
}
