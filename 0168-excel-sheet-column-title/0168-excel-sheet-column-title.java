class Solution {
    public String convertToTitle(int n) {
       String s = "";
        StringBuffer ans = new StringBuffer();
       
        while(n>0){
            n--;
           
            long rem = n%26;
            char ch =  (char) (rem + 'A');
            ans.insert(0,ch);
            //System.out.println(ch);
            n = n/26;
            
        }
        // char ch =  (char) (n + 'A' - 1);
        // ans.append(ch);
        // ans.reverse();
        return ans.toString();
    }
}