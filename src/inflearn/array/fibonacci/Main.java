package inflearn.array.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        // for (int x : solution(i)) {
        //     System.out.print(x + " ");
        // }
        solution2(i);

    }

    public static int[] solution(int i) {
        int[] answer = new int[i];

        // 피보나치 수열의 첫 두자리는 1
        answer[0] = 1;
        answer[1] = 1;

        for (int j = 2; j < i; j++) {
            // 앞의 두 수를 더한 값 구하기
            answer[j] = answer[j - 2] + answer[j - 1];
        }

        return answer;
    }

    public static void solution2(int n) {
        int a = 1, b = 1, temp;

        // 피보나치 수열의 첫 두자리는 1
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            // a와 b를 한 단계씩 교체
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
    }
}
