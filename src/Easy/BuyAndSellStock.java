package Easy;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        BuyAndSellStock2 b = new BuyAndSellStock2();
        System.out.println(b.maxProfit(prices));
    }
}

class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {

        int maxprofit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (maxprofit < prices[i] - min) {
                maxprofit = prices[i] - min;
            }
        }

        return maxprofit;
    }
}
