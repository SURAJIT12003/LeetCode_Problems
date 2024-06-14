class Solution {
    public int minProcessingTime(List<Integer> PT, List<Integer> tasks) {
        Collections.sort(PT);
        Collections.sort(tasks);

        int sum =0;
        int k = 0;
        for(int i=tasks.size()-1;i>=0;i--){
            int max =0;
            int in = i;
            for(int j=i;j>i-4;j--){
                int s = PT.get(k) + tasks.get(j);
                max = Math.max(s,max);

                in = j;
            }
          //  System.out.println(max);
            sum =Math.max(sum,max);
            i = in;
            k++;
        }

        return sum;
    }
}