class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String kDigit = convertDigit(n, k);
        long temp = 0;

        for (int i = 0; i < kDigit.length(); i++) {
            if (kDigit.charAt(i) == '0') {
                if (temp != 0 && isPrime(temp)) {
                    answer++;
                }
                temp = 0;
            } else {
                temp = temp * 10 + kDigit.charAt(i) - '0';
            }
        }
        
        if (temp % 10 != 0 && isPrime(temp)) {
            answer++;
        }

        return answer;
    }

    public static boolean isPrime(long num) {
        if (num == 1) {
            return false;
        }

        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String convertDigit(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while (n >= k) {
            sb.insert(0, n % k);
            n /= k;
        }
        sb.insert(0, n);
        return sb.toString();
    }
}