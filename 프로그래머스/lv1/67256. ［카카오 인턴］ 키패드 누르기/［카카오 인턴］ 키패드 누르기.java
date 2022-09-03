class Solution {
    static int left;
    static int right;
    static StringBuilder sb;

    private static int getDistance(int handPos, int num) {
        return (Math.abs(handPos - num) / 2) + (Math.abs(handPos - num) % 3);
    }

    private static void setRight(int num) {
        right = num;
        sb.append("R");
    }

    private static void setLeft(int num) {
        left = num;
        sb.append("L");
    }

    public String solution(int[] numbers, String hand) {
        sb = new StringBuilder();
        left = 10;
        right = 12;

        for (int num : numbers) {
            if (num == 0) {
                num = 11;
            }

            if (num % 3 == 0) {
                setRight(num);
            }

            if (num % 3 == 1) {
                setLeft(num);
            }

            if (num % 3 == 2) {
                int leftDistance = getDistance(left, num);
                int rightDistance = getDistance(right, num);

                if (leftDistance > rightDistance) {
                    setRight(num);
                }
                if (leftDistance < rightDistance) {
                    setLeft(num);
                }
                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        setRight(num);
                    } else {
                        setLeft(num);
                    }
                }
            }
        }

        return sb.toString();
    }
}