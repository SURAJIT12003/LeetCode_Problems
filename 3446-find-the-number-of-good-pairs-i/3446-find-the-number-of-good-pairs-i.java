class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int max = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int v:nums1){
            if(hs.containsKey(v)){
                int t = hs.get(v);
                t++;
                hs.put(v,t);
            }
            else{
                hs.put(v,1);
            }
            max = Math.max(v,max);
        }
        int  ans =0;
        int sqrt = (int)Math.sqrt(max);
        for(int i=0;i<nums2.length;i++){
            int t = nums2[i]*k;
            if(t==1){
                ans = ans + (nums1.length);
                continue;
            }

            for(int j=1;j<=max;j++){
                    int g = t * j;
                    if(hs.containsKey(g)){
                       int ff = hs.get(g);
                       ans+=ff;
                    }
                    if(g>max){
                        break;
                    }
            }
        }

        return ans;
    }
}