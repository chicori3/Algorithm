import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        double max = 0.0;
        double sum = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            double m = Double.parseDouble(st.nextToken());
            arr[i] = m;
            if (max < m) {
                max = m;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / max * 100;
        }

        System.out.println(sum / n);

    }
}