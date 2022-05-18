package thisiscote.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[30001]; // dp 테이블에 최적 해를 저장

        // 점화식 : ai = min(a(i-1), a(i/2), a(i/3), a(i/5)) +1
        // 1을 빼는 경우와 2,3,5로 나누는 경우에 연산 횟수를 더한다

        for (int i = 2; i <= n; i++) {
            // 현재의 수에서 1을 빼는 경우
            d[i] = d[i - 1] + 1;

            // 현재의 수가 2, 3, 5로 나누어 떨이지는 경우
            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
            if (i % 5 == 0) {
                d[i] = Math.min(d[i], d[i / 5] + 1);
            }
        }

        System.out.println(d[n]);
    }
}
