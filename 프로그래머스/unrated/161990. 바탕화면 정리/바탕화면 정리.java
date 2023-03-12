class Solution {
    int LEFT = 50;
    int UP = 50;
    int RIGHT = 1;
    int DOWN = 1;

    public int[] solution(String[] wallpaper) {
        int height = wallpaper.length;
        int weight = wallpaper[0].length();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    LEFT = Math.min(LEFT, j);
                    UP = Math.min(UP, i);
                    RIGHT = Math.max(RIGHT, j + 1);
                    DOWN = Math.max(DOWN, i + 1);
                }
            }
        }

        return new int[]{UP, LEFT, DOWN, RIGHT};
    }
}