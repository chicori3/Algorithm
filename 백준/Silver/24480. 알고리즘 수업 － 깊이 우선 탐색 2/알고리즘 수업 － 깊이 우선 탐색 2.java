import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int R;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] result;
    static int index = 1;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        result = new int[N + 1];

        init(br);
        sort();
        dfs(R);
        print();
    }

    private static void init(BufferedReader br) throws IOException {
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }
    }

    private static void sort() {
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
            Collections.reverse(graph[i]);
        }
    }

    private static void print() {
        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int curr) {
        visited[curr] = true;
        result[curr] = index++;

        for (int next : graph[curr]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
