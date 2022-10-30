import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();

        Arrays.sort(s);

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}
