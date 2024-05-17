class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        TreeMap<Integer,ArrayList<ArrayList<Integer>>> hs = new TreeMap<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int dist = Math.abs(i-rCenter)+ Math.abs(j-cCenter);
                if(hs.containsKey(dist)){
                   ArrayList<ArrayList<Integer>>arr = hs.get(dist);
                   ArrayList<Integer> s = new ArrayList<>();
                   s.add(i);
                   s.add(j);
                   arr.add(s);
                   hs.put(dist,arr);
                }
                else{
                   ArrayList<ArrayList<Integer>>arr = new ArrayList<>();
                   ArrayList<Integer> s = new ArrayList<>();
                   s.add(i);
                   s.add(j);
                   arr.add(s);
                   hs.put(dist,arr);
                }
            }
        }

        int r =0;
        int c =0;
        
        int ans[][] = new int [rows*cols][2];

        for(int v:hs.keySet()){
            ArrayList<ArrayList<Integer>>arr = hs.get(v);
            for(int i=0;i<arr.size();i++){
                ArrayList<Integer>s = arr.get(i);
                int Row  = s.get(0);
                int Col = s.get(1);
                ans[r][0] = Row;
             
                ans[r][1] = Col;
                
                 
                r++;
               
              
            }
        }

        return ans;

    }
}