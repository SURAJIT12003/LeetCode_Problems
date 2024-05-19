class Solution {
    public boolean isArraySpecial(int[] nums) {
        int even =0;
        if(nums[0]%2==0){
            even=1;
        }
        for(int i=1;i<nums.length;i++){
            if(even==1 && nums[i]%2==0){
                return false;
            }
            else if(even==0 && nums[i]%2!=0){
                return false;
            }

            if(nums[i]%2==0){
                even = 1;
            }
            else{
                even = 0;
            }
        }

        return true;
    }
}