package inflearn.string.reverseWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }
        for (String s : main.solution(n, strArr)) {
            System.out.println(s);
        }

    }

    public String[] solution(int n, String[] strArr) {
        String[] answer = new String[n];

        for (String s : strArr) {
            String result = "";
            char[] charArr = s.toCharArray();
            // 반복문을 거꾸로 시작
            for (int i = s.length(); 0 < i; i--) {
                result += charArr[i - 1];
            }
            answer[0] = result;
        }

        return answer;
    }

    public String[] solution2(int n, String[] strArr) {
        String[] answer = new String[n];
        int cnt = 0;

        for (String s : strArr) {
            // StringBuilder를 사용하면 메모리 낭비없이 쉽게 조작 가능
            String result = new StringBuilder(s).reverse().toString();
            answer[cnt] = result;
            cnt++;
        }

        return answer;
    }

    public ArrayList<String> solution3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // 순열형태의 문제를 풀 때 사용하는 공식
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}
