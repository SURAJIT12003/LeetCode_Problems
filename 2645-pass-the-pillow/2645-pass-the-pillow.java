class Solution {
    public int passThePillow(int n, int time) {
        //time = time +1;
        ArrayList<Integer> arr = new ArrayList<>();
        int k=0;
        int i=1;
        boolean dir= false;
        while(k<time){
            if(i==1){
               dir=false;
            }
           if(i==n){
              dir=true;
           }
           if(dir==false){
              i++;
           } 
            if(dir==true){
              i--;
            }
            arr.add(i);
            k++;
        }
        
        int ans =0;
        ans = arr.get(arr.size()-1);
        return ans ;
        
        
    }
}