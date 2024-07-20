class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int in =0;
        for(int i=0;i<nums.length;i++){
            count++;
            int j= i;
            while(j<nums.length && nums[j]==nums[i]){
                j++;
            }

            nums[in] = nums[i];
            i = j-1;
            in++;
        }
        return count;
    }
}