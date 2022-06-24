package Easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        //Set initial profit to 0
        int profit = 0;
        //Return 0 for no profit scenarios
        if(prices == null || prices.length <= 1) {
            return profit;
        }
        //Set lowest value to first price
        int low = prices[0];
        //Start loop from 1 (Buy + sell on first day = zero profit)
        for(int i = 1 ; i < prices.length ; i++) {
            //Check if profit for current price minus low is greater than the current profit
            if(prices[i] - low > profit) {
                profit = prices[i] - low;
            }
            //Check if the current price is the lowest value encountered
            if(prices[i] < low) {
                low = prices[i];
            }
        }
        return profit;
    }
}
