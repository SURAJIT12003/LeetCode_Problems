class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n  = numbers.length;
        int low = 0;
        int high = n-1;
        int ans [] = new int [2];

        while(low<=high){
            //int mid = (low+high)/2;
            if(target==numbers[low]+numbers[high]){
                ans[0] = low+1;
                ans[1] = high+1;
                break;
            }
            if(target<numbers[low]+numbers[high]){
                high--;
            }
            else {
                low++;
            }
        }

        return ans;
    }
}