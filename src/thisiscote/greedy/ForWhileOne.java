package thisiscote.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForWhileOne {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int result = 0;

        while (x != 1) {
            result++;
            if (x % y == 0) {
                x /= y;
                continue;
            }
            x -= 1;
        }

        System.out.println(result);
    }
}
