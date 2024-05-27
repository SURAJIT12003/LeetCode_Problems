class Solution {

    public int sub(int nums[],int k){
        int left =0;
        int right  = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        int count =0;

        while(right < nums.length){
            int curr = nums[right];
            if(hs.containsKey(curr)){
                int t = hs.get(curr);
                t++;
                hs.put(curr,t);
            }
            else{
                hs.put(curr,1);
            }

            while(hs.size()>k){
                int t = hs.get(nums[left]);
                t--;
                if(t==0){
                    hs.remove(nums[left]);
                }
                else{
                    hs.put(nums[left],t);
                }
                left++;
            }

            count = count + (right-left+1);
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int f = sub(nums,k);
        int s = sub(nums,k-1);
        return f-s;
    }
}