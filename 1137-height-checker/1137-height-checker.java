class Solution {
    public int heightChecker(int[] heights) {
        ArrayList<Integer> arr =new ArrayList<>();
        int n = heights.length;
        for (int i=0;i<n;i++){
            arr.add(heights[i]);
        }

        Arrays.sort(heights);
        int count = 0;
        for (int i=0;i<n;i++){
             if (heights[i]!=arr.get(i)){
                 count ++;
             }
        }

        return count ;
    }
}