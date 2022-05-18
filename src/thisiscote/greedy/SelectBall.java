package thisiscote.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        // 공의 무게는 1~10 0은 제외하기 위해 배열 11로 생성
        int[] arr = new int[11];

        // 입력받은 무게에 해당하는 배열의 값을 하나씩 증가
        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            arr[x] += 1;
        }

        int result = 0;

        /**
         * N = 5, M = 3
         * 1 3 2 3 2
         */

        // 1부터 m까지의 각 무게에 대하여 처리
        for (int i = 1; i <= M; i++) {
            N -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            result += arr[i] * N; // B가 선택하는 경우의 수와 곱해주기
        }

        System.out.println(result);
    }
}
