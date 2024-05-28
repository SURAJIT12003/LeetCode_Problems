class Solution {

    public boolean rec(int index,int nums[],int dp[]){
        if(index>=nums.length-1){
            return true;
        }

        if(dp[index]!=-1){
            if(dp[index]==1){
                return true;
            }
            return false;
        }

        int nindex = index+nums[index];
        for(int i=index+1;i<=nindex;i++){
            boolean yt = rec(i,nums,dp);
            if(yt){
                dp[index] = 1;
                return true;
            }
        }
        dp[index] = 0;
        return false;

    }
    public boolean canJump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        dp[nums.length-1] = 1;
        for(int index=nums.length-2;index>=0;index--){

            int nindex = index+nums[index];

            for(int i=index+1;i<=nindex;i++){
                int  yt = dp[i];
                if(yt==1){
                    dp[index] = 1;
                    break;
                }
            }
            if(dp[index]==-1){
                dp[index] = 0;
            }
        } 

        if(dp[0]==1){
            return true;
        }
        return false;
    }
}