class Solution {

    public int fib(int n) {
        if(n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int t = fib(n-1);
        int f = fib(n-2);
        return t+f;
    }
}