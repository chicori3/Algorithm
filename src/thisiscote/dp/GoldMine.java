package thisiscote.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoldMine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] dp = new int[n][m]; // dp 테이블

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 점화식
            // 왼쪽, 왼쪽 위, 왼쪽 아래에서 오는 값 중 가장 높은 값
            // dp[i][j] = arr[i][j] + max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1])

            for (int j = 1; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    int leftUp = 0;
                    int leftDown = 0;
                    int left = dp[i][j - 1];

                    if (i != 0) {
                        leftUp = dp[i - 1][j - 1];
                    }

                    if (i != n - 1) {
                        leftDown = dp[i + 1][j - 1];
                    }

                    dp[i][j] = dp[i][j] + Math.max(left, Math.max(leftUp, leftDown));
                }
            }

            int result = 0;
            for (int i = 0; i < n; i++) {
                result = Math.max(result, dp[i][m - 1]);
            }

            System.out.println(result);
        }
    }
}
