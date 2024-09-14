class Solution {

    public boolean rec(int r, int c, int n, int m, int grid[][], int health, boolean visit[][],int dp[][][]) {
        
        if (health <= 0) {

            return false;
        }
        if (r == n - 1 && c == m - 1) {
           // System.out.println(r+" "+c+" "+health);
            if (grid[r][c] == 1) {
                health--;
            }
            if (health >= 1) {
                return true;
            }
            return false;
        }

        if (visit[r][c]) {
            return false;
        }

        if(dp[r][c][health]!=-1){
            if(dp[r][c][health]==1){
                return true;
            }
            return false;
        }

        visit[r][c] = true;

       

        boolean right = false;
        boolean down = false;
        boolean left = false;
        boolean up = false;

        if (c + 1 < m) {
            if (grid[r][c] == 1) {
                right = rec(r, c + 1, n, m, grid, health - 1,visit,dp);
            } else {
                right = rec(r, c + 1, n, m, grid, health,visit,dp);
            }
        }
        if (c - 1 >= 0) {
            if (grid[r][c] == 1) {
                left = rec(r, c - 1, n, m, grid, health - 1,visit,dp);
            } else {
                left = rec(r, c - 1, n, m, grid, health,visit,dp);
            }

        }
        if (r + 1 < n) {
            if (grid[r][c] == 1) {
                down = rec(r + 1, c, n, m, grid, health - 1,visit,dp);
            } else {
                down = rec(r + 1, c, n, m, grid, health,visit,dp);
            }
        }

        if (r - 1 >= 0) {
            if (grid[r][c] == 1) {
                up = rec(r - 1, c, n, m, grid, health - 1,visit,dp);
            } else {
                up = rec(r - 1, c, n, m, grid, health,visit,dp);
            }
        }

        visit[r][c] = false;
        if (right || down || left || up) {
            dp[r][c][health] = 1;
            return true;
        }
        dp[r][c][health] =0;
        return false;
    }

    public boolean findSafeWalk(List<List<Integer>> arr, int health) {
        int n = arr.size();
        int m = arr.get(0).size();
        int grid[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                grid[i][j] = arr.get(i).get(j);
            }
        }
        boolean visit[][] = new boolean[n][m];
        int dp[][][] = new int [n][m][health+1];
         
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            Arrays.fill(dp[i][j],-1);
           }
        }

        return rec(0, 0, n, m, grid, health,visit,dp);
    }
}