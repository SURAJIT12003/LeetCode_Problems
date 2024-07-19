class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int total =0;
        for(int i=1;i<n;i++){
            total = Math.max(prices[i]-min,total);
            min = Math.min(min,prices[i]);
        }

        return total;
    }
}