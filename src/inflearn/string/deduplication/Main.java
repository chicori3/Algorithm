package inflearn.string.deduplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(main.solution2(str));
    }

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            // 중복되는 경우 현재 index보다 indexOf의 값이 작음
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public String solution2(String str) {
        // answer에 바로 집어 넣기 위해 StringBuilder 사용
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (answer.toString().indexOf(c) == -1) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
