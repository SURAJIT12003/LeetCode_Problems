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
        int dp[] = new int [n+1];
        dp[n] = 0;
        int prev =0;
        int morePrev =0;
        for(int i=n-1;i>=0;i--){
            int take = nums[i];
            int not  = 0;
            if(i+2<n){
                take  = take +morePrev;
            }
            if(i+1<n){
                not = not +prev;
            }
            int curr = Math.max(take,not);
            morePrev  = prev;
            prev  = curr;
        }

        return prev;
        
    }
}