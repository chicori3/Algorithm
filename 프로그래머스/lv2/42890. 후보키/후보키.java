import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution {
    Comparator<Integer> comp = new Comparator<Integer>() {
        int countBits(int n) {
            int ret = 0;
            while (n != 0) {
                if ((n & 1) != 0) {
                    ret++;
                }
                n = n >> 1;
            }
            return ret;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            int x = countBits(o1);
            int y = countBits(o2);

            return Integer.compare(x, y);
        }
    };

    public int solution(String[][] relation) {
        int answer = 0;
        int rowSize = relation.length;
        int colSize = relation[0].length;
        List<Integer> candidates = new LinkedList<>();

        // 공집합을 제외하기 위해 1부터 시작
        for (int i = 1; i < 1 << colSize; i++) {
            if (check(relation, rowSize, colSize, i)) {
                candidates.add(i);
            }
        }

        candidates.sort(comp);

        while (candidates.size() != 0) {
            int n = candidates.remove(0);
            answer++;

            // 최소성을 만족하지 못한 후보 키는 제거
            candidates.removeIf(c -> (n & c) == n);
        }

        return answer;
    }

    boolean check(String[][] relation, int rowSize, int colSize, int subset) {
        // 이중 for문으로 모든 쌍의 경우를 조합
        for (int i = 0; i < rowSize - 1; i++) {
            for (int j = i + 1; j < rowSize; j++) {
                boolean isSame = true;
                for (int k = 0; k < colSize; k++) {
                    if ((subset & 1 << k) == 0) {
                        continue;
                    }
                    if (!relation[i][k].equals(relation[j][k])) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    return false;
                }
            }
        }
        return true;
    }
}
