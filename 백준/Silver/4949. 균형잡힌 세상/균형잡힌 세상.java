import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (true) {
            if (line.equals(".")) {
                break;
            }
            sb.append(isBalanced(line)).append("\n");
            line = br.readLine();
        }

        System.out.println(sb);
    }

    static String isBalanced(String line) {
        Stack<Character> stack = new Stack<>();
        String str = line.replaceAll("[a-zA-Z\\s]", "");

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                stack.pop();
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? "yes" : "no";
    }
}
