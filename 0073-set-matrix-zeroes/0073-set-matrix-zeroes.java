class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int [n][m];
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

       // System.out.println(row);
       // System.out.println(col);
        for(int i=0;i<n;i++){
            if(row.contains(i)){
                Arrays.fill(ans[i],0);
                continue;
            }
            for(int j=0;j<m;j++){
                ans[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<m;i++){
            if(col.contains(i)){
                for(int k=0;k<n;k++){
                    ans[k][i] = 0;
                }
            }
            
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //System.out.print(ans[i][j]+" ");
                matrix[i][j] = ans[i][j];
            }
            //System.out.println(" ");
        }

        
    }
}