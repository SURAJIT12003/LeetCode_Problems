class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max[] = new int [n];
        int m =0;
        for(int i=n-1;i>=0;i--){
            m = Math.max(m,prices[i]);
            max[i]  = m;
        }

        int ans =0;
        for(int i=0;i<n;i++){
            int t  = max[i]-prices[i];
            ans  = Math.max(ans,t);
        }
        return ans;

    }
}