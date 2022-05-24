import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer dp[][] = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibo(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append("\n");
        }

        System.out.println(sb);
    }

    public static Integer[] fibo(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibo(N - 1)[0] + fibo(N - 2)[0];
            dp[N][1] = fibo(N - 1)[1] + fibo(N - 2)[1];
        }

        return dp[N];
    }
}
