class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        TreeMap<Double,ArrayList<Integer>> hs = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            double t  =(double) arr[i];
            for(int j=i+1;j<arr.length;j++){
                double d = (double) t /arr[j];
                ArrayList<Integer> s = new ArrayList<>();
                s.add(arr[i]);
                s.add(arr[j]);
                hs.put(d,s);
            }
        }
       // System.out.println(hs);

        int ans []  = new int [2];
        int j =0;
        for(double v:hs.keySet()){
            j++;
            if(j==k){
                ArrayList<Integer> s  = hs.get(v);
                ans[0]=s.get(0);
                ans[1] =s.get(1);
            }
        }

        return ans;
    }
}