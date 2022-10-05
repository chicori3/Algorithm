import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int zero = 0;
        int one = 0;
        int prev = 2;

        for (char c : str.toCharArray()) {
            int curr = c - '0';

            if (prev == curr) {
                continue;
            }

            prev = curr;

            if (curr == 0) {
                zero++;
            } else {
                one++;
            }
        }

        System.out.println(Math.min(zero, one));
    }
}