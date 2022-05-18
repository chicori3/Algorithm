package inflearn.array.countscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i : arr) {
            // 정답이면 가산점을 먼저 추가하고 대입
            if (i == 1) {
                sum += 1;
                answer += sum;
            } else {
                sum = 0; // 오답이면 가산점 초기화
            }
        }

        return answer;
    }
}
