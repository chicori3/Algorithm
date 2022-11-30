import java.io.*;

public class Main {

    static int[] queue = new int[2000000];
    static int rear = 0;
    static int front = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            execute(line);
        }

        System.out.println(sb);
    }

    static boolean isEmpty() {
        return rear - front == 0;
    }

    static void execute(String command) {
        String[] commands = command.split(" ");

        switch (commands[0]) {
            case "push": {
                push(Integer.parseInt(commands[1]));
                return;
            }
            case "pop": {
                pop();
                return;
            }
            case "size": {
                size();
                return;
            }
            case "empty": {
                empty();
                return;
            }
            case "front": {
                getFront();
                return;
            }
            case "back": {
                getBack();
            }
        }
    }

    static void push(int num) {
        queue[rear] = num;
        rear++;
    }

    static void pop() {
        if (isEmpty()) {
            sb.append(-1).append("\n");
            return;
        }
        sb.append(queue[front]).append("\n");
        front++;
    }

    static void size() {
        sb.append(rear - front).append("\n");
    }

    static void empty() {
        if (isEmpty()) {
            sb.append(1).append("\n");
            return;
        }
        sb.append(0).append("\n");
    }


    static void getFront() {
        if (isEmpty()) {
            sb.append(-1).append("\n");
            return;
        }
        sb.append(queue[front]).append("\n");
    }

    static void getBack() {
        if (isEmpty()) {
            sb.append(-1).append("\n");
            return;
        }
        sb.append(queue[rear - 1]).append("\n");
    }
}
