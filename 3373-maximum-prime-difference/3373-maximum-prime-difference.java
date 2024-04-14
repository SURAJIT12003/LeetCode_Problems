class Solution {
     public  boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int maximumPrimeDifference(int[] nums) {
        int diff =0;
        int in1 =0;
        int in2 =0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                in1=i;
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(isPrime(nums[i])){
                in2=i;
                break;
            }
        }

        return in2-in1;
    }
}