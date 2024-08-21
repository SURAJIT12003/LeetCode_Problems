class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer> rt =new HashSet<>();
        for(int v:nums2){
            if(hs.contains(v)){
                rt.add(v);
            }
        }

        int ans[] =new int [rt.size()];
        int index =0;
        for(int v:rt){
            ans[index] = v;
            index++;
        }
        return ans;

    }
}