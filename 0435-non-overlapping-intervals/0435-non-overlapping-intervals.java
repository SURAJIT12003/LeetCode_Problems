class Solution {
    public int eraseOverlapIntervals(int[][] arr) {

        int n = arr.length;
         Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return Integer.compare(o1[1], o2[1]); // Ascending order by second column
                } else {
                    return Integer.compare(o2[0], o1[0]); // Descending order by first column
                }
            }
        });
        
        int count = 0;
        int prevEnd = arr[0][1];
        //System.out.println(prevEnd);
        for(int i=1;i<n;i++){
            
            if(prevEnd<=arr[i][0]){
               
                prevEnd = arr[i][1];
            }
            else{
                count++;
            }
        }
        
        return count;
    }
}