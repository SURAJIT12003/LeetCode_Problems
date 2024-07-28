class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for (int v : nums) {
            min = Math.min(min, v);
            sum += v;
        }

        int t  = min*n;
        int ans = sum-t;
        return ans;

    }
}