import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        LinkedList<Integer> list = new LinkedList<>();

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            list.offer(i);
        }

        int[] seq = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            int targetIndex = list.indexOf(seq[i]);
            int halfIndex = list.size() % 2 == 0 ? list.size() / 2 - 1 : list.size() / 2;

            if (targetIndex <= halfIndex) {
                for (int j = 0; j < targetIndex; j++) {
                    list.offer(list.pollFirst());
                    count++;
                }
            } else {
                for (int j = 0; j < list.size() - targetIndex; j++) {
                    list.offerFirst(list.pollLast());
                    count++;
                }
            }
            list.poll();
        }

        System.out.println(count);
    }
}
