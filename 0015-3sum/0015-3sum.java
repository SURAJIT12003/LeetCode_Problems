class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<nums.length;i++){

            int j = i+1;
            int k = nums.length-1;
            int curr  = nums[i];

            while( j<n && k>=0 && j<k){
                int sum = curr + nums[j] + nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else if(sum==0){
                    List<Integer> s = new ArrayList<>();
                    s.add(curr);
                    s.add(nums[j]);
                    s.add(nums[k]);
                    ans.add(s);
                    int g = nums[j];
                    int t = nums[k];
                    while(j<n && nums[j]==g){
                        j++;
                    }

                    while(k>=0 && nums[k]==t){
                        k--;
                    }
                }
            }

            while(i<n-1 && nums[i+1]==curr){
                i++;
            }
        }

        return ans;
    }
}