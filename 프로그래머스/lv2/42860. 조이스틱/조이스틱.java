class Solution {
    public int solution(String name) {
		int answer = 0;
		int length = name.length();
		int move = name.length() - 1;

		for (int i = 0; i < length; i++) {
			char c = name.charAt(i);
			answer += Math.min(c - 65, 26 - (c - 65));

			if (i < length - 1 && name.charAt(i + 1) == 65) {
				int endA = i + 1;
				while (endA < length && name.charAt(endA) == 65) {
					endA++;
					move = Math.min(move, i * 2 + (length - endA));
					move = Math.min(move, i + (length - endA) * 2);
				}
			}
		}

		return answer + move;
	}
}