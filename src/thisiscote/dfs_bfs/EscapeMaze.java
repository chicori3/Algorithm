package thisiscote.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class EscapeMaze {

    // 좌표
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int N;
    static int M;

    static int[][] square = new int[201][201];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 2차원 배열 초기화
        for (int x = 0; x < N; x++) {
            String str = br.readLine();
            for (int y = 0; y < M; y++) {
                square[x][y] = str.charAt(y) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x, int y) {

        // 큐 구현
        Queue<Node> deque = new ArrayDeque<>();

        // 가장 뒤에 좌표값을 가진 노드 추가
        deque.offer(new Node(x, y));

        while (!deque.isEmpty()) {
            Node node = deque.poll();
            x = node.getX();
            y = node.getY();

            // 상하좌우 확인
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                // 범위를 넘어서면 무시
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }

                // 괴물이 있으면 무시
                if (square[nx][ny] == 0) {
                    continue;
                }

                if (square[nx][ny] == 1) {
                    square[nx][ny] = square[x][y] + 1;
                    deque.offer(new Node(nx, ny));
                }
            }
        }

        return square[N - 1][M - 1];
    }

}

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
