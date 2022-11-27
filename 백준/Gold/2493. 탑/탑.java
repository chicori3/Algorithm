import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<int[]> top = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!top.isEmpty()) {
                if (top.peek()[0] < num) {
                    top.pop();
                    continue;
                }
                if (top.peek()[0] >= num) {
                    sb.append(top.peek()[1] + " ");
                    break;
                }
            }

            if (top.empty()) {
                sb.append("0 ");
            }

            top.push(new int[]{num, i}); // 탑의 높이와 탑의 번호 배열을 저장
        }

        System.out.println(sb);
    }
}