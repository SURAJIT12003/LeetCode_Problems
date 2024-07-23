class Solution {

    public boolean rec(int index,int r,int c,String word,int n,int m,char board[][]){
        if(index==word.length() || word.length()==1){
            return true;
        }
        if(word.charAt(index)!=board[r][c]){
            return false;
        }

        board[r][c] = '0';

        //top
        boolean top=false;
        boolean left=false;
        boolean right=false;
        boolean bottom=false;

        if(r-1>=0){
            top = rec(index+1,r-1,c,word,n,m,board);
        }

        if(c-1>=0){
            left = rec(index+1,r,c-1,word,n,m,board);
        }

        if(c+1<m){
            right = rec(index+1,r,c+1,word,n,m,board);
        }

        if(r+1<n){
            bottom = rec(index+1,r+1,c,word,n,m,board);
        }

       
           board[r][c] = word.charAt(index);
        return left || right || bottom || top;

    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(word.charAt(0)==board[i][j]){
               
                  boolean r = rec(0,i,j,word,n,m,board);
                 // System.out.println(r);
                  if(r){
                    return true;
                  }
               }
            }
        }

        return false;
    }
}