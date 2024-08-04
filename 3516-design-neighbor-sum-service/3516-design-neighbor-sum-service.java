class neighborSum {

    public int adjacment(int i,int j,int n,int m,int grid[][]){
        int total =0;
        if(i-1>=0){
            total +=grid[i-1][j];
        }
        if(i+1<n){
            total+=grid[i+1][j];
        }
        if(j-1>=0){
            total+=grid[i][j-1];
        }
        if(j+1<m){
            total+=grid[i][j+1];
        }
        return total;
    }

    public int side(int i,int j,int n,int m,int grid[][]){
        int total =0;
        if(i-1>=0 && j-1>=0){
            total +=grid[i-1][j-1];
        }
        if(i+1<n && j-1>=0){
            total+=grid[i+1][j-1];
        }
        if(i-1>=0 && j+1<m){
            total+=grid[i-1][j+1];
        }
        if(i+1<n && j+1<m){
            total+=grid[i+1][j+1];
        }
        return total;
    }

    int grids[][];
    public neighborSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        grids = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grids[i][j]  = grid[i][j];
            }
        }
    }
    
    public int adjacentSum(int value) {
        int sum =0;
        int yt =0;
        int n = grids.length;
        int m = grids[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grids[i][j]==value){
                    int total = adjacment(i,j,n,m,grids);
                    sum+=total;
                    yt = 1;
                    break;
                }
            }
            if(yt==1){
                break;
            }
        }
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum =0;
        int yt =0;
        int n = grids.length;
        int m = grids[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grids[i][j]==value){
                    int total = side(i,j,n,m,grids);
                    sum+=total;
                    yt = 1;
                    break;
                }
            }
            if(yt==1){
                break;
            }
        }

        return sum;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */