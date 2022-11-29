import java.io.*;
import java.util.*;

public class Main {

    static ListIterator<Character> iterator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            System.out.println(edit(str));
        }
    }

    static String edit(String password) {
        char[] chars = password.toCharArray();
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> list = new LinkedList();
        iterator = list.listIterator();

        for (int i = 0; i < chars.length; i++) {
            extracted(chars[i]);
        }

        while (!list.isEmpty()) {
            sb.append(list.poll());
        }

        return sb.toString();
    }

    static void extracted(char c) {
        if (c == '<') {
            if (iterator.hasPrevious()) {
                iterator.previous();
            }
            return;
        }
        if (c == '>') {
            if (iterator.hasNext()) {
                iterator.next();
            }
        }
        if (c == '-') {
            if (iterator.hasPrevious()) {
                iterator.previous();
                iterator.remove();
                return;
            }
        }
        if (Character.isLetterOrDigit(c)) {
            iterator.add(c);
        }
    }
}