class Solution {

    public boolean check(int num ){
        int s = num;
        while(s!=0){
            int r = s%10;
            if(r==0 || num%r!=0){
                return false;
            }
            s = s/10;  
            //System.out.println(s);
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans = new ArrayList<>();

        while(left<=right){
            if(check(left)){
                ans.add(left);
            }
            left++;
        }

        return ans;
    }
}