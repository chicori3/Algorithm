import java.io.*;
import java.util.*;

public class Main {

    static ArrayDeque<String> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String command = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] numbers = parseArray(line);
            fillDeque(numbers);
            sb.append(execute(command)).append("\n");
        }

        System.out.println(sb);
    }

    static String[] parseArray(String line) {
        String replaced = line.replaceAll("[\\[\\]]", "");
        return replaced.split(",");
    }

    static void fillDeque(String[] numbers) {
        Collections.addAll(deque, numbers);
    }

    static String execute(String command) {
        boolean isFliped = false;
        StringBuilder sb = new StringBuilder();
        int length = command.length();

        for (int i = 0; i < length; i++) {
            char c = command.charAt(i);

            if (c == 'R') {
                isFliped = !isFliped;
                continue;
            }

            if (deque.isEmpty() || deque.peek().equals("")) {
                deque.clear();
                return "error";
            }
            if (isFliped) {
                deque.pollLast();
            } else {
                deque.pollFirst();
            }

        }

        sb.append("[");

        if (deque.size() == 1) {
            return sb.append(deque.poll()).append("]").toString();
        }

        while (deque.size() > 1) {
            if (!isFliped) {
                sb.append(deque.pollFirst()).append(",");
            } else {
                sb.append(deque.pollLast()).append(",");
            }
        }

        String last = deque.peek() != null ? deque.poll() : "";
        return sb.append(last).append("]").toString();
    }
}
