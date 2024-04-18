class Solution {

    public int rec(int nums[], int total) {
      int count =0;
      int sum =0;
      for(int v:nums){
        sum+=v;
        if(sum>total){
            return count;
        }
        count++;
        if(sum==total){
            return count;
        }
      }

      return count ;

    }

    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        int ans[] = new int[m];
        Arrays.sort(nums);
        for (int i = 0; i < m; i++) {
            int t = queries[i];
           
            int s = rec(nums, t);
            ans[i] = s;
        }

        return ans;
    }
}