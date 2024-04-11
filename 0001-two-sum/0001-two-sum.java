class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hashmap code use 
        HashMap<Integer,Integer> hs = new HashMap<>();
        int ans [] = new int [2];
        for(int i=0;i<nums.length;i++){
            int t = target-nums[i];
            if(hs.containsKey(t)){
                ans[0] = hs.get(t);
                ans[1] = i;  
                break;
            }
            
            hs.put(nums[i],i);
                
        }

        return ans ;

    }
}