class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int sum =0;
        for(int v:nums){
            sum+=v;
        }

        int t =0;
        for(int i=nums.length-1;i>=0;i--){
            t+=nums[i];
            int g = sum-t;
            ans.add(nums[i]);
            if(t>g){
                break;
            }
        }

        return ans;
    }
}