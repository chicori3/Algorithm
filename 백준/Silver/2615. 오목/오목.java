import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] dr = {-1, 0, 1, 1, 1, 0, -1, -1};
    private static int[] dc = {1, 1, 1, 0, -1, -1, -1, 0};

    private static String[][] map = new String[19][19];

    private static int cnt;
    private static int index = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 19; i++) {
            map[i] = br.readLine().split(" ");
        }


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("1") || map[i][j].equals("2")) {
                    // 우상, 우, 우하, 하 4방향 찾기
                    for (int k = 0; k < 4; k++) {
                        cnt = 1;
                        // 오목이라면 6목 방지 정반대 방향 확인
                        if (check(k, map[i][j], i, j) == 5 && !checkPrev(k + 4, map[i][j], i, j)) {
                            System.out.printf("%s\n%d %d", map[i][j], i + 1, j + 1);
                            index = 1; // 승리한 돌 존재 표시
                            return;
                        }
                    }
                }
            }
        }
        //승리한 플레이어 없음
        if (index != 1) {
            System.out.println(0);
        }
    }
    //////////////////////////////////////메서드 부분/////////////////////////////

    // 특정 바둑알 기준 특정 방향으로 5알 연속 바둑알 존재시 반대방향 탐지용(6목 이상 여부) 메서드
    private static boolean checkPrev(int k, String player, int r, int c) {
        //바둑판 경계를 넘지 않으며 && 파라미터로 받은 방향(↙,←,↖,↑ 중 1)에 바둑알이 존재한다면 True->즉 6목 이상
        return 0 <= r + dr[k] && r + dr[k] < 19 && 0 <= c + dc[k] && c + dc[k] < 19 && map[r + dr[k]][c + dc[k]].equals(player);
    }

    // 특정 방향 구분자, 돌의 색깔, 탐색 시작 지점을 파라미터로 받음
    private static int check(int k, String player, int r, int c) {

        switch (k) {
            case 0:
            case 1:
            case 2:

        }
        if (k == 0) { //↗방향 탐색 (k==1 or 2, or 3일 때 같은 로직)
            //바둑판 밖을 탐색하는 경우가 아니고, 해당 방향에 같은 색의 바둑돌이 존재한다면
            if (nan(k, player, r, c))
                return cnt;
        } else if (k == 1) {//→방향 탐색
            if (nan(k, player, r, c))
                return cnt;
        } else if (k == 2) {//↘방향 탐색
            if (nan(k, player, r, c))
                return cnt;
        } else if (k == 3) {//↘방향 탐색
            if (nan(k, player, r, c))
                return cnt;
        }
        return cnt;
    }

    private static boolean nan(int k, String player, int r, int c) {
        if (0 <= r + dr[k] && r + dr[k] < 19 && 0 <= c + dc[k] && c + dc[k] < 19 && map[r + dr[k]][c + dc[k]].equals(player)) {
            cnt++; // 연속된 바둑알 수 ++
            check(k, player, r + dr[k], c + dc[k]); //해당 방향 계속 탐색
        } else {
            // 바둑판 밖을 탐색하는 경우거나, 해당 방향에 바둑돌이 존재하지 않는 경우 셋던 바둑알 수 return
            return true;
        }
        return false;
    }
}