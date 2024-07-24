class Solution {

    public int check(int r,int c,int board[][],int n,int m){
        int count =0;
        if(r-1>=0 && board[r-1][c]==1){
            count++;
        }

        if(r+1<n && board[r+1][c]==1){
            count++;
        }

        if(c+1<m && board[r][c+1]==1){
            count++;
        }

        if(c-1>=0 && board[r][c-1]==1){
            count++;
        }
        if(r-1>=0 && c+1<m && board[r-1][c+1]==1){
            count++;
        }
        if(r-1>=0 && c-1>=0 && board[r-1][c-1]==1){
            count++;
        }
        if(r+1<n && c-1>=0 && board[r+1][c-1]==1){
            count++;
        }
        if(r+1<n && c+1<m && board[r+1][c+1]==1){
            count++;
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int ans[][] = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int s = check(i,j,board,n,m);
                if(board[i][j]==0){
                    if(s==3){
                        ans[i][j] = 1;
                    }
                }
                else{
                    if(s==2 || s==3){
                        ans[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                board[i][j] = ans[i][j];
            }
        }
    }
}