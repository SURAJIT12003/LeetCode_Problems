class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int first =0;
        int last =0;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            last = i; 
            sum+=nums[i];
            if(sum>target){
                while(sum>target && first<=last){
                    int dist = (last-first)+1;
                    ans = Math.min(ans,dist);
                    sum-=nums[first];
                    first++;
                }
            }
            if(sum>=target){
                // System.out.println(ans);
                int dist = (last-first)+1;
                ans = Math.min(ans,dist);
            }

          
            
        }

        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}