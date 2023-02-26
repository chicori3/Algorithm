import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        int result = 0;

        for (char c : nums.toCharArray()) {
            result += c - '0';
        }

        System.out.println(result);
    }
}
