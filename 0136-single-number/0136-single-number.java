class Solution {
    public int singleNumber(int[] nums) {
        int or = 0;
        for(int i=0;i<nums.length;i++){
            int t  = nums[i] ^ or;
            or = t;
            //System.out.println(or);
        }
        return or;
    }
}