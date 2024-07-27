




class Solution {
    
    
    
    
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long  adjMatrix[][] = new long [26][26];
        int n = adjMatrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               
                    adjMatrix[i][j] = (long) 1e9; // (this is short from of - Integer.MAX_VALUE )
                
                 if(i==j){
                    adjMatrix[i][j]=0;
                }
            }
        }

        for(int i=0;i<original.length;i++){
            int   u = original[i]-'a';
            int   v = changed[i]-'a';
            long  wt  = (long)cost[i];
            adjMatrix[u][v] = Math.min(cost[i],adjMatrix[u][v]);
        }

        // for(int i=0;i<26;i++){
        //     for(int j=0;j<26;j++){
        //        if(adjMatrix[i][j]==0 ){
        //           adjMatrix[i][j] = -1;
        //        }
        //     }
           
        // }
        
        // Code here 
        
        

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    if(adjMatrix[j][i]==(long)1e9 || adjMatrix[i][k]==(long)1e9){
                        continue;
                    }
                   adjMatrix[j][k]  = Math.min(adjMatrix
                   [j][k],adjMatrix[j][i]+adjMatrix[i][k]);

                }
            }
        }
        
         for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (adjMatrix[i][j] == (long) 1e9) {
                    adjMatrix[i][j] = -1;
                }
                //System.out.print(adjMatrix[i][j] + " ");
            }
            //System.out.println();
        }
        
        
        long ans =0;
        for(int i=0;i<source.length();i++){
            int u = source.charAt(i)-'a';
            int v = target.charAt(i)-'a';
            if( adjMatrix[u][v]==-1){
                return -1;
            }
            ans+=adjMatrix[u][v];
        }
        
        return ans;
    }
}