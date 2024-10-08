class Solution {
    public int rec(int index,int n){
        if(index>n){
            return 0;
        }
        int t = rec(index+1,n-index)+1;
        return t;
    }
    public int arrangeCoins(int n) {
        return rec(1,n);
    }
}