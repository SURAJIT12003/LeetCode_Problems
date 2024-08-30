class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
            int ans =0;
            int product = 1;
            int first =0;
            int last = 0;
            
            for(int i=0;i<nums.length;i++){
                last =i;
                product *=nums[i];
                while(product>=k && first<=last){
                    product/=nums[first];
                    first++;
                }
                ans+=last-first+1;

            }
            return ans;
    }
}