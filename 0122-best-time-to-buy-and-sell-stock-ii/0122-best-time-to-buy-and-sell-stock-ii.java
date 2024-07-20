class Solution {
    public int rec(int index,int isBuy,int prices[],int dp[][]){
        if(index==prices.length){
            return 0;
        }
        if(dp[index][isBuy]!=-1){
            return dp[index][isBuy];
        }
        int take =0;
        int not =0;
        if(isBuy==0){
            take = rec(index+1,1,prices,dp)-prices[index];
        }
        else{
            take = rec(index+1,0,prices,dp)+prices[index];
        }
        not  = rec(index+1,isBuy,prices,dp);
        dp[index][isBuy] = Math.max(take,not);
        return  dp[index][isBuy];
    }

    public int maxProfit(int[] prices) {
        int dp[][] = new int [prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(0,0,prices,dp);
    }
}