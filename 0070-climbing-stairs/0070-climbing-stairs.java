class Solution {

    public int rec(int n,int in,int dp[]){
        if(in==n){
            return 1;
        }
        if(in>=n){
            return 0;
        }
        if(dp[in]!=-1){
            return dp[in];
        }

        int one = rec(n,in+1,dp);
        int two = rec(n,in+2,dp);
        dp[in] = one+two;
        return one+two;

    }


    public int climbStairs(int n) {
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return rec(n,0,dp);
    }
}