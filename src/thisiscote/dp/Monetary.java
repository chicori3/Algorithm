package thisiscote.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Monetary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] d = new int[m];
        for (int i = 1; i < m; i++) {
            d[i] = 10001; // 만들 수 없는 수로 초기화
        }

        // 점화식
        // a(i-k)를 만들 수 있는 경우 : a(i) = min(a(i), a(i-k) +1)
        // a(i-k)를 만들 수 없는 경우 : a(i) = INF

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                // (i-k) 원을 만들 수 있는 경우
                if (d[j - arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }
        // (i-k) 원을 만들 수 없는 경우
        if (d[m] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(d[m]);
        }

    }
}
