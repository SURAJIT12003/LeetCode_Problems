class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
       
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

       
        for(int i=0;i<n;i++){
            if(row.contains(i)){
                Arrays.fill(matrix[i],0);
                continue;
            }
            
        }

        for(int i=0;i<m;i++){
            if(col.contains(i)){
                for(int k=0;k<n;k++){
                    matrix[k][i] = 0;
                }
            }
            
        }

       

        
    }
}