class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n  = intervals.length;
        int arr[][]  = new int [n+1][2];
        for(int i=0;i<n;i++){
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
        }

        arr[n][0] = newInterval[0];
        arr[n][1] = newInterval[1];

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