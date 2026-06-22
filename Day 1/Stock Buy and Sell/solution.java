// consider each of the day starting from day 2 as a selling day for the buying day that is minimum uptill now
// that way we can keep track of a running minimum value and calculate profit for each selling day 
// O(n) approack


class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0, n= prices.length,running_min = prices[0];
        for(int i=1;i<n;i++){
            if (prices[i] > running_min)
                max_profit = Math.max(prices[i]-running_min,max_profit);
            running_min = Math.min(running_min,prices[i]);
        }
        return max_profit;
    }
}