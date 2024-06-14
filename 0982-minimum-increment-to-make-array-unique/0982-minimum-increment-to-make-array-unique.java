class Solution {
    public int minIncrementForUnique(int[] nums) {
         int count =0;
         Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                int t = nums[i];
                int l = nums[i+1];
                int r = t -nums[i+1];
                r++;
                count = count +r;
                nums[i+1]= l+r;
            }
        }

        return count ;
    }
}