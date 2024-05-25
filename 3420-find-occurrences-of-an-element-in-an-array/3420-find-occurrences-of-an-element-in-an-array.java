class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int c = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                hs.put(c,i);
                c++;
            }
        }

        int ans[] = new int [queries.length];
        for(int i=0;i<queries.length;i++){
            int t = queries[i];
            if(t<=hs.size()){
                ans[i] = hs.get(t);
            }
            else{
                ans[i] = -1;
            }
        }

        return ans;
    }
}