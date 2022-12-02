import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int X = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        int answer = 0;
        int sum;

        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == X) {
                answer++;
            }
            if (sum <= X) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(answer);
    }
}
