class Solution {
    public int rec(int index,int nums[],int n,int dp[]){
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int take = rec(index+2,nums,n,dp)+nums[index];
        int not  = rec(index+1,nums,n,dp);
        dp[index] = Math.max(take,not);
        return dp[index];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int [n];
        Arrays.fill(dp,-1);
        return rec(0,nums,nums.length,dp);
    }
}