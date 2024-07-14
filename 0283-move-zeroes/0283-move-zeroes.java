class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int sp = -1;
                for(int j=i-1;j>=0;j--){
                    if(nums[j]==0){
                        sp = j;
                    }
                    else{
                        break;
                    }
                }
                if(sp!=-1){
                   nums[sp] = nums[i];
                   nums[i] =0;
                }
            }
        }
    }
}