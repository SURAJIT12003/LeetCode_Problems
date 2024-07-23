class Solution {

    public boolean rec(int index,int r,int c,String word,boolean visit[][],int n,int m,char board[][]){
        if(index==word.length() || word.length()==1){
            return true;
        }
        if(word.charAt(index)!=board[r][c]){
            return false;
        }

        if(visit[r][c]){
            return false;
        }

        visit[r][c] = true;

        //top
        boolean top=false;
        boolean left=false;
        boolean right=false;
        boolean bottom=false;

        if(r-1>=0){
            top = rec(index+1,r-1,c,word,visit,n,m,board);
        }

        if(c-1>=0){
            left = rec(index+1,r,c-1,word,visit,n,m,board);
        }

        if(c+1<m){
            right = rec(index+1,r,c+1,word,visit,n,m,board);
        }

        if(r+1<n){
            bottom = rec(index+1,r+1,c,word,visit,n,m,board);
        }

         visit[r][c] = false;
        return left || right || bottom || top;

    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        boolean visit[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(word.charAt(0)==board[i][j]){
               
                  boolean r = rec(0,i,j,word,visit,n,m,board);
                  System.out.println(r);
                  if(r){
                    return true;
                  }
               }
            }
        }

        return false;
    }
}