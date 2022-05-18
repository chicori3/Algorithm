package thisiscote.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPacking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = s.length(); // 압축하지 못할 경우 최대값

        // 입력받은 문자열의 길이 반 이상을 넘어가면 비교하는 의미가 없음
        for (int i = 1; i <= s.length() / 2; i++) {
            int pos = 0; // 비교할 위치
            int len = s.length();

            for (; pos + i <= s.length(); ) {
                // 비교할 문자열
                String unit = s.substring(pos, pos + i);
                pos += i; // 비교할 위치를 i만큼 증가

                int cnt = 0;
                for (; pos + i <= s.length(); ) {

                    // 현재 비교하는 문자열이 다음 문자열과 일치하는 패턴이라면 카운트
                    if (unit.equals(s.substring(pos, pos + i))) {
                        cnt++;
                        pos += i;
                    } else {
                        break;
                    }
                }

                // 길이 계산
                if (cnt > 0) {

                    // 압축시킨 만큼 길이를 줄일 수 있음
                    len -= i * cnt;

                    // 1의 자리면 정수 하나, 10의 자리면 정수 둘 식으로 길이 계산
                    if (cnt < 9) {
                        len += 1;
                    } else if (cnt < 99) {
                        len += 2;
                    } else if (cnt < 999) {
                        len += 3;
                    } else {
                        len += 4;
                    }
                }

                // 최소값을 저장
                answer = Math.min(answer, len);
            }
        }

        return answer;
    }
}
