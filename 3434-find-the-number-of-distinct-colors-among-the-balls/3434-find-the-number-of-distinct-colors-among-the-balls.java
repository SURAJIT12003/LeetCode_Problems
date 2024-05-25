class Solution {
    public int[] queryResults(int limit, int[][] quer) {
        int n = quer.length;
        int ans [] = new int [n];
        HashMap<Integer,Integer> bol = new HashMap<>();
        HashMap<Integer,HashSet<Integer>> color = new HashMap<>();

        for(int i=0;i<n;i++){
            
           int bb = quer[i][0];
           int cc = quer[i][1];

           if(!bol.containsKey(bb) && !color.containsKey(cc)){
                bol.put(bb,cc);
                HashSet<Integer> s = new HashSet<>();
                s.add(bb);
                color.put(cc,s);
                if(i==0){
                    ans[i] = 1;
                }
                else{
                    ans[i] = ans[i-1]+1;
                }
                
           }
           else if(bol.containsKey(bb) && !color.containsKey(cc)){
                int pc = bol.get(bb);
                bol.put(bb,cc);
                HashSet<Integer> s = color.get(pc);
               // System.out.println(s);
                if(s!=null && s.size()!=0){
                    s.remove(bb);
                }
              
                HashSet<Integer> sk = new HashSet<>();
                sk.add(bb);
                if( s==null || s.size()==0){
                    color.remove(pc);
                }
                    color.put(cc,sk);
                
                
                ans[i] = color.size();
           }
           else if (!bol.containsKey(bb) && color.containsKey(cc)){
              bol.put(bb,cc);
               HashSet<Integer> sk = color.get(cc);
                sk.add(bb);
                color.put(cc,sk);
                ans[i] = ans[i-1];
           }
           else{
                int pc = bol.get(bb);
                bol.put(bb,cc);
                HashSet<Integer> s = color.get(pc);
               // System.out.println(s);
                if(s!=null && s.size()!=0){
                    s.remove(bb);
                }
              
                HashSet<Integer> sk = color.get(cc);
                sk.add(bb);
                if( s==null || s.size()==0){
                    color.remove(pc);
                }
                    color.put(cc,sk);
                
                
                ans[i] = color.size();
                //ans[i] = color.size();
           }

          // System.out.println(color);
        }


        return ans;
    }
}