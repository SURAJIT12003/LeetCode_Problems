class Solution {
    public int maxProfit(int[] prices) {
        int n  = prices.length;
        int small[]  = new int [n];
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min = prices[i];    
            }
            small[i] = min;
        }

        int great[] = new int [n];
        int max =0;
      
        for(int i=n-1;i>=0;i--){
            if(max<prices[i]){
                max = prices[i];    
            }
            great[i] = max;
           
        }

        int ans =0;
        
        for(int i=0;i<n;i++){
           // System.out.println(great[i]+" "+small[i]);
            int t = great[i]-small[i];
            ans = Math.max(ans,t);
        }
        if(ans<0){
            return 0;
        }
        return ans;
    }
}