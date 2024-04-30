class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         ArrayList<Integer> arr = new ArrayList<>();
         ArrayList<Integer> ab = new ArrayList<>();
         int count =0;
         int n = mat.length;
         for(int i=0;i<n;i++){
             for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count ++;
                }
             }
            arr.add(i,count);
            ab.add(i,count);
            count=0;
         }
         Collections.sort(arr);
         int ans[] = new int [k];
         for(int i=0;i<k;i++){
            int in = ab.indexOf(arr.get(i));
            ans[i]=in;
            ab.set(in,-11);
            
         }
         return ans;


    }
}