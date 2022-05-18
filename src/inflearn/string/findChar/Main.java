package inflearn.string.findChar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        Scanner sc = new Scanner(System.in);

        // 문자열과 문자 읽기
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(test.solution(str, c));
    }

    public int solution(String str, char t) {
        int answer = 0;

        // 대문자로 변환
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // for문으로 일치하면 ++
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == t) {
        //         answer += 1;
        //     }
        // }

        // forEach
        for (char c : str.toCharArray()) {
            if (c == t) {
                answer += 1;
            }
        }

        return answer;
    }
}
