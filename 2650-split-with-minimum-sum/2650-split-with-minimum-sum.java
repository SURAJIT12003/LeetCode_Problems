class Solution {
    public int splitNum(int num) {
       int a =0;
       int b =0;
       String s ="";
       s=s+num;
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=0;i<s.length();i++){
         int t = s.charAt(i)-'0';
         arr.add(t);
       }
       Collections.sort(arr);
       for(int i=0;i<arr.size();i++){
         if(i%2==0){
            int t = 10*a;
            t=t+arr.get(i);
            a=t;
         }
         else{
            int t = 10*b;
            t=t+arr.get(i);
            b=t;
         }
       }

       int sum = a+b;
       return sum;
    }
}