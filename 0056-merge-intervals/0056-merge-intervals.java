class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));

        int start = arr[0][0];
        int end = arr[0][1];
        TreeMap<Integer,Integer> hs = new TreeMap<>();

        for(int i=1;i<arr.length;i++){
            int currStart = arr[i][0];
            int currEnd = arr[i][1];
            if(end>=currStart){
                end = Math.max(end,currEnd);
            }
            else{
                hs.put(start,end);
                start = currStart;
                end = currEnd;
            }
        }
        hs.put(start,end);
        int ans [][] = new int [hs.size()][2];
        int in =0;
        for(int v:hs.keySet()){
            ans[in][0] = v;
            ans[in][1] = hs.get(v);
            in++;
        }

        return ans;
    }
}