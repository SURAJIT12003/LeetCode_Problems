class Solution {
    public int removeDuplicates(int[] nums) {
        int in =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            int j = i;
            int inc =0;
            while(j<nums.length && nums[i]==nums[j]){
                inc++;
                j++;
            }
            if(inc==1){
                nums[in] = nums[i];
                in++; 
            }
            else if(inc>=2){
                nums[in] = nums[i];
                in++; 
                nums[in] = nums[i];
                in++;
            }
            i = j-1;
        }
        return in;
    }
}