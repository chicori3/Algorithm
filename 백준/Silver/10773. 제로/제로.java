import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            Integer input = Integer.valueOf(br.readLine());
            pushOrPop(input);
        }

        for (Integer num : stack) {
            answer += num;
        }

        System.out.println(answer);
    }

    private static void pushOrPop(Integer input) {
        if (input == 0) {
            stack.pop();
        } else {
            stack.push(input);
        }
    }
}

