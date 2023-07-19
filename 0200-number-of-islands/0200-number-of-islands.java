class Solution {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static char[][] map;
    static boolean[][] checked;
    static int height;
    static int weight;

    private static boolean isValidArea(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < weight && ny < height;
    }

    public int numIslands(char[][] grid) {
        map = grid;
        checked = new boolean[grid.length][grid[0].length];
        int answer = 0;
        height = map[0].length;
        weight = map.length;

        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < height; j++) {
                if (!checked[i][j] && map[i][j] == '1') {
                    dfs(i, j);
                    answer++;
                }
            }
        }

        return answer;
    }

    public void dfs(int x, int y) {
        checked[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (isValidArea(nx, ny)) {
                if (!checked[nx][ny] && map[nx][ny] == '1') {
                    dfs(nx, ny);
                }
            }
        }
    }
}