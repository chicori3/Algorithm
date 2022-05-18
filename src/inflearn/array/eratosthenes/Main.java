package inflearn.array.eratosthenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        // index가 n만큼 생성되도록 +1
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {

            // 배열이 빈 값이면 소수
            if (arr[i] == 0) {
                answer++;

                // 배수 구하기
                // 입력값까지 반복하면서 배수를 구함
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }
}
