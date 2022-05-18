package inflearn.array.reverseprime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(N, arr)) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 숫자 뒤집기
        for (int i = 0; i < N; i++) {
            int temp = arr[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    // 소수 판별 메서드
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        // 약수가 있으면 소수가 아님
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
