class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0){
            return 0;
        }
        int left =0;
        int right =0;
        ArrayList<Character> arr = new ArrayList<>();
        int length =1;
        arr.add(s.charAt(0));

        while(right<n-1){
            right++;
            if(arr.contains(s.charAt(right))){
                while(arr.contains(s.charAt(right)) && left<=right){
                    arr.remove(0);
                    left++;
                }
                arr.add(s.charAt(right));
            }
            else{
                arr.add(s.charAt(right));
            }
            length = Math.max(length,(right-left+1));
            //System.out.println(right+" "+left);
        }

        return length;
    }
}