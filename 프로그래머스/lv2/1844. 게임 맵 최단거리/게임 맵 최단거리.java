import java.util.*;

class Solution {
    int[][] visited;
    int m, n;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        m = maps.length;
        n = maps[0].length;
        visited = new int[m][n];

        bfs(maps);
        return visited[m - 1][n - 1] == 0 ? -1 : visited[m - 1][n - 1];
    }

    void bfs(int[][] maps) {
        visited[0][0] = 1;
        var queue = new LinkedList<int[]>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            var curr = queue.remove();
            var y = curr[0];
            var x = curr[1];

            for (var i = 0; i < 4; i++) {
                var ny = y + dy[i];
                var nx = x + dx[i];

                if (ny >= m || ny < 0 || nx >= n || nx < 0) continue;
                if (visited[ny][nx] == 0 && maps[ny][nx] == 1) {
                    visited[ny][nx] = visited[y][x] + 1;
                    queue.add(new int[]{ny, nx});
                }
            }
        }
    }
}