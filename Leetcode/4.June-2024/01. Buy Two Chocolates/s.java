import java.util.ArrayList;

class Solution {
    public int buyChoco(int[] prices, int money) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int tmp = 0;
                if (prices[i] > prices[j]) {
                    tmp = prices[i];
                    prices[i] = prices[j];
                    prices[j] = tmp;
                }
            }
        }
        ArrayList<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int a = prices[i] + prices[j];
                if (a <= money) {
                    pairs.add(a); 
                }
            }
        }
        if (pairs.isEmpty()) {
            return money;
        } else {
            int min = pairs.get(0);
            for (int i = 1; i < pairs.size(); i++) {
                if (pairs.get(i) < min) {
                    min = pairs.get(i);
                }
            }
            return money - min;
        }
    }
}
