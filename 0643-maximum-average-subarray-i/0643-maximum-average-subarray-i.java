class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int right =0;
        double sum =0;
        for(int i=0;i<k;i++){
            sum+=(double)nums[i];
        }
        double avg = (sum)/(double)k;
        double max =Integer.MIN_VALUE;
        max = Math.max(max,avg);
        right = k;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[left];
            left++;
            sum=sum+nums[right];
            right++;
            avg = (sum)/(double)k;
            max = Math.max(max,avg);
        }

        return max;
    }
}