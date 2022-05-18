package inflearn.string.reverseWord2;

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
        char[] chars = str.toCharArray(); // 문자 배열로 변환
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            // 알파벳이 아니라면 자리교체 없이 lt, rt 증가
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                // 둘 다 알파벳이라면 자리 교체
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        // 문자 배열 String 변환
        return String.valueOf(chars);
    }
}
