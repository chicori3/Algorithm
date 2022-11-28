import java.io.*;
import java.util.*;

public class Main {
    static ListIterator<String> iterator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<>();

        String str = br.readLine();
        for (char c : str.toCharArray()) {
            list.add(c + "");
        }

        iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            edit(line);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }

        System.out.println(sb);
    }

    static void edit(String line) {
        String[] split = line.split(" ");

        if ("L".equals(split[0])) {
            if (iterator.hasPrevious()) {
                iterator.previous();
            }
            return;
        }
        if ("D".equals(split[0])) {
            if (iterator.hasNext()) {
                iterator.next();
            }
            return;
        }
        if ("B".equals(split[0])) {
            if (iterator.hasPrevious()) {
                iterator.previous();
                iterator.remove();
            }
            return;
        }
        if ("P".equals(split[0])) {
            iterator.add(split[1]);
        }
    }
}
