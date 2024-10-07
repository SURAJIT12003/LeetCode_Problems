class Solution {
     public int check(int n ){
        int sum =0;
        while(n!=0){
            int r = n%10;
          
            sum+=r;
            n = n/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(true){
            int t = check(num);
            if(num==1 || num==2 || num==3 || num==4 || num==5 || num==6 || num==7 || num==8 || num==9 || num==0){
                return num;
            }
            num = t;
        }
        //return num;
    }
}