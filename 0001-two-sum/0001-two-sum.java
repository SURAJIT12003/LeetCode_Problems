class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int ans[] = new int [2];
        for(int i=0;i<nums.length;i++){
            int t = target-nums[i];
            if(hs.containsKey(t)){
                int index = hs.get(t);
                ans[0] = index;
                ans[1] = i;
                break;
            }
            hs.put(nums[i],i);
        }
        return ans;
    }
}