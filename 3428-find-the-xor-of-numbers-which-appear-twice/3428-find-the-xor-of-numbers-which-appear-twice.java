class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t = nums[i];
            if(hs.containsKey(t)){
                int g = hs.get(t);
                g++;
                hs.put(t,g);
            }
            else{
                hs.put(t,1);
            }
        }


        int sum =0;
        for(int v:hs.keySet()){
            int g = hs.get(v);
            if(g==2){
                sum = sum ^ v;
            }
            
        }
        return sum;
    }
}