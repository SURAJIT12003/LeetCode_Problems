class Solution {

    public boolean check( ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i!=j){
                    int t = arr.get(i) & arr.get(j);
                    if(t!=0){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    public int longestNiceSubarray(int[] nums) {
        int n  = nums.length;
        int left =0;
        int right =0;
        int length =1;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(nums[0]);

        while(right<n-1){
            right++;
            arr.add(nums[right]);
            while(!check(arr) && left<=right){
                Integer rt = nums[left];
                arr.remove(rt);
                left++;
            }
            length = Math.max(length,(right-left)+1);
        }
        return length;
    }
}