class Solution {
    public int rec(int i,int k,int arr[],int dp[]){
        if(i>=arr.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take = rec(i+k,k,arr,dp);
        if(take== Integer.MIN_VALUE){
            take = arr[i];
        }
        else{
            take+=arr[i];
        }
        dp[i] = take;
       // int not = rec(i-1,k,arr);
        //System.out.println( Math.max(take,not));
        //return Math.max(take,not);
        return take;
    }
    public int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int dp[] = new int [energy.length];
        Arrays.fill(dp,-1);
        for(int i=0;i<energy.length;i++){
            int t = rec(i,k,energy,dp);
            max = Math.max(max,t);
        }
        return max;
    }
}