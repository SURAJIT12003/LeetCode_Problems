class Solution {

    public int check(int n ){
        int sum =0;
        while(n!=0){
            int r = n%10;
            int db = r*r;
            sum+=db;
            n = n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        while(n!=0){
            if(n==2|| n==3|| n==4||n==5||n==6||n==8||n==9){
                return false;
            }
            int t = check(n);
            n=t;
            if(n==1){
                return true;
            }
        }

        return false;
    }
}