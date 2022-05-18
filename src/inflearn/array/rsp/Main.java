package inflearn.array.rsp;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (char x : solution(n, arr1, arr2).toCharArray()) {
            System.out.println(x);
        }
    }

    public static String solution(int n, int[] arr1, int[] arr2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                answer.append("D");
            } else if (arr1[i] == 1 && arr2[i] == 3 || arr1[i] == 2 && arr2[i] == 1 || arr1[i] == 3 && arr2[i] == 2) {
                answer.append("A");
            } else {
                answer.append("B");
            }
        }

        return answer.toString();
    }
}
