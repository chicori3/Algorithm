package thisiscote.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumberRule {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        int i = 0;

        while (st2.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st2.nextToken());
            i++;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int first = arr[arr.length - 1];
        int second = arr[arr.length - 2];
        int result = 0;

        // 방법 1.
        /*while (M != 0) {
            for (int j = 1; j <= K; j++) {
                result += first;
                M--;
            }
            if (M == 0) {
                break;
            }
            result += second;
            M--;
        }*/

        // 방법 2.
        int count = (M / (K + 1)) * K; // 수열에서 first가 사용되는 횟수
        count += M % (K + 1); // 수열 이외에 나머지 first가 사용되는 횟수

        result += count * first; // count는 first가 등장하는 횟수
        result += (M - count) * second; // M에서 first가 등장하는 횟수를 빼면 second의 개수가 된다.

        System.out.println(result);

    }
}
