class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int right =0;
        int length =0;
        int ans =0;
        int n = nums.length;

        while(right<n){
            if(nums[right]==0 && k!=0){
                right++;
                k--;
            }
            else if(nums[right]==0 && k==0){
               
                while(nums[left]!=0 && left<=right){
                    left++;
                }
                left++;
                k++;
            }
            else{
                right++;
            }
            length  =Math.max(length,(right-left+1));
        }
        return length-1;
    }
}