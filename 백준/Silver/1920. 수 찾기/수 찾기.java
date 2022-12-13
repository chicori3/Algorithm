import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nArr = makeArr(N, br);
        Arrays.sort(nArr);

        int M = Integer.parseInt(br.readLine());
        int[] mArr = makeArr(M, br);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            sb.append(binarySearch(nArr, mArr[i])).append("\n");
        }

        System.out.println(sb);
    }

    static int[] makeArr(int N, BufferedReader br) throws IOException {
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }

    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return 1;
            }
        }

        return 0;
    }
}