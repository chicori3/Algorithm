package thisiscote.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st1.nextToken());
        int col = Integer.parseInt(st1.nextToken());

        int[] arr = new int[row]; // 행 배열 생성

        for (int i = 0; i < row; i++) {
            // 카드 숫자 입력받기
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE; // 비교하기 위한 최대숫자
            for (int j = 0; j < col; j++) { // 입력받은 열만큼 반복
                // Math.min으로 최솟값 비교
                min = Math.min(min, Integer.parseInt(st2.nextToken()));
                arr[i] = min;
            }
        }

        System.out.println(
                // 최소값 중 최대값을 얻는 스트림
                Arrays.stream(arr)
                        .max()
                        .getAsInt()
        );
    }
}
