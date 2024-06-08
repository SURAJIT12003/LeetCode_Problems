class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(hs.contains(curr)){
                count++;
                hs.removeAll(hs);
                hs.add(curr);
            }
            else{
                hs.add(curr);
            }
        }

        count++;
        return count;
    }
}