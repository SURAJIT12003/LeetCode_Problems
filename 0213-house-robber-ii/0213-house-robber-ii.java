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
        if(n==1){
            return nums[0];
        }
        int dp[] = new int [n+1];
        Arrays.fill(dp,-1);
        int f = rec(1,nums,n,dp);
        Arrays.fill(dp,-1);
        int g = rec(0,nums,n-1,dp);
        return Math.max(g,f);
    }
}