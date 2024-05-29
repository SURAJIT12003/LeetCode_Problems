class Solution {
      public int  rec(int index,int nums[],int dp[]){
        if(index>=nums.length-1){
            return 0;
        }

        if(dp[index]!=-1){
           return dp[index];
        }

        int nindex = index+nums[index];
        int min = Integer.MAX_VALUE;
        for(int i=index+1;i<=nindex;i++){
            int  yt = rec(i,nums,dp);
            if(yt!=Integer.MAX_VALUE){
                yt = yt +1;
                min = Math.min(min,yt);
            }
           
        }
       
        dp[index] = min;
        return min;

    }
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(0,nums,dp);
    }
}