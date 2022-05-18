import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];

        for (int i : lost) {
            students[i]--;
        }
        for (int i : reserve) {
            students[i]++;
        }

        for (int i = 1; i < students.length - 1; i++) {
            if (students[i] == -1) {
                if (students[i - 1] == 1) {
                    students[i - 1]--;
                    students[i]++;
                } else if (students[i + 1] == 1) {
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }

        long count = Arrays.stream(students).filter(value -> value == -1).count();
        return (int) (n - count);
    }
}