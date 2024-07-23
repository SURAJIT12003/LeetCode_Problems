class Solution {

    public boolean rec(int index,int nums[],int  dp[]){
        if(index>=nums.length || index==nums.length-1){
            return true;
        }

        if(dp[index]!=-1){
            if(dp[index]==1){
                return true;
            }
            return false;
        }

        boolean take = false;
        for(int i=1;i<=nums[index];i++){
            take = rec(index+i,nums,dp);
            if(take){
                dp[index] = 1;
                return true;
            }
        }
        dp[index] = 0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
       
        dp[n-1]  = 1;
        for(int index=n-2;index>=0;index--){
             boolean take = false;
            for(int i=1;i<=nums[index];i++){
               if(index+i<n){

                 if(dp[index+i]==1){
                    take = true;
                 }
               }
              
            }

            if(take){
                dp[index] = 1;
            }
            else{
                 dp[index] = 0;
            }
           
           
        }

        if(dp[0]==1){
            return true;
        }
        return false;
    }
}