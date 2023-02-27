import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Cards cardsA = new Cards(cards1);
        Cards cardsB = new Cards(cards2);

        for (String keyword : goal) {
            if (!cardsA.isMatch(keyword) && !cardsB.isMatch(keyword)) {
                return "No";
            }
        }

        return "Yes";
    }
}

class Cards {
    private Queue<String> cardQueue = new LinkedList<>();

    public Cards(String[] cards) {
        for (String card : cards) {
            cardQueue.add(card);
        }
    }

    public boolean isMatch(String keyword) {
        if (!cardQueue.isEmpty() && cardQueue.peek().equals(keyword)) {
            cardQueue.poll();
            return true;
        }
        return false;
    }
}