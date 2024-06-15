class Solution {
    HashMap<Integer,String> hs = new HashMap<>();
    List<String> ans = new ArrayList<>();

    public void rec(int index,String digits,String s){
        if(index==digits.length()){
            
            ans.add(s);
            return ;
        }
        String g = hs.get(digits.charAt(index)-'0');

        for(int i=0;i<g.length();i++){
            rec(index+1,digits,s+g.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        
         if(digits.length()==0){
            return ans;
         }
        hs.put(2,"abc");
        hs.put(3,"def");
        hs.put(4,"ghi");
        hs.put(5,"jkl");
        hs.put(6,"mno");
        hs.put(7,"pqrs");
        hs.put(8,"tuv");
        hs.put(9,"wxyz");

        rec(0,digits,"");
        return ans;

    }
}