class Solution {
    public int rec(int coins[], int V, int index, int dp[][]) {
        if (index == coins.length - 1) {
            if (V % coins[index] == 0) {
                return V / coins[index];
            }
            return Integer.MAX_VALUE;
        }
        if (dp[index][V] != -1) {
            return dp[index][V];
        }
        int take = Integer.MAX_VALUE;
        int non = Integer.MAX_VALUE;
        if (V >= coins[index]) {
            take = rec(coins, V - coins[index], index, dp);
            if (take != Integer.MAX_VALUE) {
                take++;
            }
        }

        non = rec(coins, V, index + 1, dp);
        dp[index][V] = Math.min(non, take);
        return dp[index][V];

    }

    public int coinChange(int[] coins, int V) {
        int M = coins.length;
        int dp[][] = new int[M + 1][V + 1];
        for (int i = 0; i < M; i++) {
            Arrays.fill(dp[i], -1);
        }
        int t = rec(coins, V, 0, dp);
        if (t == Integer.MAX_VALUE) {
            return -1;
        }

        return t;
    }
}