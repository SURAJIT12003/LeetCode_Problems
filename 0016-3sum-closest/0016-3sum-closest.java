class Solution {
    public int threeSumClosest(int[] A, int X) {
       Arrays.sort(A);
       
       boolean yt = true;
       int n = A.length;
       int maxAbs = Integer.MAX_VALUE;
       int maxAns =Integer.MIN_VALUE;
       
       for(int i=0;i<n;i++){
           
           int lo = i+1,hi = n-1;
           while(lo<hi){
               int current = A[i]+A[lo]+A[hi];
               if(current==X){
                   return current;
               }
               if(current<X){
                   lo++;
                   int t = Math.abs(current-X);
                    if(t<maxAbs){
                       maxAns = current;
                       maxAbs = t;
                   }
                   else if(t<=maxAbs){
                       maxAns = Math.max(maxAns,current);
                   }
                   
                   
               }
               else{
                   int t = Math.abs(current-X);
                   if(t<maxAbs){
                       maxAns = current;
                       maxAbs = t;
                   }
                   else if(t<=maxAbs){
                       maxAns = Math.max(maxAns,current);
                   }
                   hi--;
               }
               
           }
           
       }
       
       return maxAns;
    }
}