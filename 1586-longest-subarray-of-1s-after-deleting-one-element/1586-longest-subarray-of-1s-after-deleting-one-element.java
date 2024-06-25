class Solution {
    public int longestSubarray(int[] nums) {
        int left =0;
        int right =0;
        int one =0;
        int zero =0;
        int max =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }

            if(zero==2){
                while(zero!=1 && left<=right){
                    if(nums[left]==0){
                        zero--;
                    }
                    left++;
                }
            }
            int diff = (right-left)+1;
            right++;
            max = Math.max(max,diff);
        }

        return max-1;
    }
}