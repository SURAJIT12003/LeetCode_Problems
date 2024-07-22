class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hs  =new HashMap<>();
        hs.put(0,1);
        int count =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];
            int rem = sum % k;
            if(rem<0){
                rem  = rem + k;
            }

            if(hs.containsKey(rem)){
                count+=hs.get(rem);
            }

            if(hs.containsKey(rem)){
                int t = hs.get(rem);
                t++;
                hs.put(rem,t);
            }
            else{
                hs.put(rem,1);
            }

        }

        return count;
    }
}