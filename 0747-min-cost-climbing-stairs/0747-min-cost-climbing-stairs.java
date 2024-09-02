class Solution {

    public int rec(int index,int cost[],int dp[]){
        if(index>=cost.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int one = rec(index+1,cost,dp)+cost[index];
        int two = rec(index+2,cost,dp)+cost[index];
        dp[index] =Math.min(one,two);
        return Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int [cost.length];
        Arrays.fill(dp,-1);
        int ans =  rec(0,cost,dp);
        Arrays.fill(dp,-1);
        int ans1 = rec(1,cost,dp);
        return Math.min(ans,ans1);
    }
}