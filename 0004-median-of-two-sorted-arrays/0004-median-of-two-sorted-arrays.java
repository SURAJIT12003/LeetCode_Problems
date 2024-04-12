class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int v:nums1){
            arr.add(v);
        }

        for(int g:nums2){
            arr.add(g);

        }

        Collections.sort(arr);

        if(arr.size()%2!=0){
            int t = arr.size()/2;
          //  System.out.println(t);
            double r = (double)arr.get(t);
            return r;

        } 
double r = (double)arr.get(arr.size()/2)+(double)arr.get(arr.size()/2-1);
r = r/2;
return r;

    }
}