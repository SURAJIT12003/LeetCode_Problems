class Solution {
    public int maxScore(int[] card, int k) {
        int totalSum  =0;
        int ans =0;
        int n = card.length;

        for(int v:card){
            totalSum+=v;
        }

        int len = n-k;
        int f = 0;
        int l = len-1;

        int sum =0;
        for(int i=0;i<=l;i++){
            sum+=card[i];
        }
       // System.out.println(sum);
        ans = Math.max(ans,totalSum-sum);

        for(int i=1;i+len<=n;i++){
            sum=sum-card[f];
            l++;
            sum=sum+card[l];
            f++;
            // System.out.println(sum);
             ans = Math.max(ans,totalSum-sum);

        }

        return ans;
    }
}