class AscendingOrderComparator implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
        // Compare to achieve descending order
        return  Double.compare(o2, o1);
    }
}

class Solution {

    public int halveArray(int[] nums) {
        if(nums.length==1 && nums[0]==1){
            return 1;
        }
        PriorityQueue<Double> pq = new PriorityQueue<>(new AscendingOrderComparator());
        double sum =0;
        for(int v:nums){
            double t = (double)v;
            pq.add(t);
            sum+=t;
        }
        double mid  = sum/2;
        double t = sum;
        int count =0;
       
        while(sum>=mid){
            double m = pq.poll()/2;
            sum = sum-m;
            pq.add(m);
           // System.out.println(sum);
        //   if(t%2==0 || sum%2==0){
            if(sum==mid){
                count++;
                break;
            }
        //   }
         // System.out.println(sum+" "+mid);
            count++;
        } 

        return count;
    }
}