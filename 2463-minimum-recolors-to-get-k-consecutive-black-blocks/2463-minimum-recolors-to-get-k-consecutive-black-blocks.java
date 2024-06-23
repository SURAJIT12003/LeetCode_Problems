class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0;
        int black = 0;
        int left =0;
        int right =0;
        int min   = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            char curr = blocks.charAt(i);
            if(curr=='W'){
                white++;
            }
            else{
                black++;
            }
        }
        right  = k;
        min  = Math.min(min,white);
        //Sys

        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(left)=='W'){
                white--;
            }
            else{
                black--;
            }
            left++;
            if(blocks.charAt(right)=='B'){
                black++;
            }
            else{
                white++;
            }
            min = Math.min(min,white);
            right++;
        }

        return min;

    }
}