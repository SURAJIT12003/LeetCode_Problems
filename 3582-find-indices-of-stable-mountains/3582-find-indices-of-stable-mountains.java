class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer>ans  = new ArrayList<>();
        for(int i=0;i<height.length;i++){
            if(i!=0){
                if(height[i-1]>threshold){
                    ans.add(i);
                }
            }
        }

        return ans;
    }
}