package thisiscote.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int count = 0; // 거스름돈의 개수
        int[] coinArr = {500, 100, 50, 10}; // 잔돈의 종류

        for (int coin : coinArr) {
            count += X / coin; // 거스름돈에 필요한 잔돈의 개수 연산
            // X = X % coin; // 입력값을 잔돈으로 나눈 나머지로 대입
            X %= coin;
        }

        System.out.println(count);
    }
}
