class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total=0;
        int size = n-k;
        int left =0;
        int right =0;
        int sum =0;
        int max =0;
        for(int v:cardPoints){
            total+=v;
        }
        for(int i=0;i<size;i++){
            sum+=cardPoints[i];
        }
        right = size;
        max = Math.max(max,total-sum);
     


        for(int i=1;i<n;i++){
            sum = sum-cardPoints[left];
            left++;
            sum=sum+cardPoints[right];
            max = Math.max(max,total-sum);
            right++;
            if(right==n){
                break;
            }
        }

        return max;
    }
}