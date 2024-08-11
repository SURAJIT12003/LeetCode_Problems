class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max  = 0;
        int n  = nums.length;
        int count =0;
        for (int i=0;i<n;i++){
            if (nums[i]==1){
                count =1;
                int in =i;
                for (int j=i+1;j<n;j++){
                    in= j;
                  if (nums[j]==1){
                      count ++;
                  }
                  if (nums[j]==0){
                      break;
                  }
               }
              
            i = in;
            if (max<count){
                max = count ;
            }
            //count =0;

            }
         
            
            
        }

        return max ;
    }
}